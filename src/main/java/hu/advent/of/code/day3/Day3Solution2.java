package hu.advent.of.code.day3;

import hu.advent.of.code.BaseSolution;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.util.ArrayList;

@Slf4j
public class Day3Solution2 extends BaseSolution {

    private ArrayList<FabricClaim> claims = new ArrayList<>();
    private final int CLOTHSIZE = 1000;
    private int[][] cloth = new int[CLOTHSIZE][CLOTHSIZE];
    private int idThatDoesNotOverlap = -1;

    @Override
    public void run() throws IOException {
        loadDataFromFile("input3.txt");

        for (int i = 0; i < data.size(); i = i +4) {
            String[] pos = data.get(i+2).split(",|:");
            String[] size = data.get(i+3).split("x");
            FabricClaim claim = new FabricClaim(data.get(i), Integer.parseInt(pos[0]), Integer.parseInt(pos[1]), Integer.parseInt(size[0]), Integer.parseInt(size[1]));
            claims.add(claim);
        }
        claims.forEach(this::putClaimOnCloth);
        claims.forEach(this::sliceBack);
        //printCloth();
        log.info("(Day 3, part 2) Answer: {}", idThatDoesNotOverlap);
    }

    private void putClaimOnCloth(FabricClaim claim) {
        for (int x = claim.getX(); x < claim.getWidth() + claim.getX(); x++) {
            for (int y = claim.getY(); y < claim.getHeigth() + claim.getY(); y++) {
                cloth[x][y] = cloth[x][y]+1;
            }
        }
    }

    private void sliceBack(FabricClaim claim) {
        if(idThatDoesNotOverlap == -1) {
            for (int x = claim.getX(); x < claim.getWidth() + claim.getX(); x++) {
                for (int y = claim.getY(); y < claim.getHeigth() + claim.getY(); y++) {
                    if (cloth[x][y] != 1) {
                        return;
                    }
                }
            }
            idThatDoesNotOverlap = Integer.parseInt(claim.getId().substring(1));
        }
    }

    private int countOverlap() {
        int sq = 0;
        for (int x = 0; x < CLOTHSIZE; x++) {
            for (int y = 0; y < CLOTHSIZE; y++) {
                if (cloth[x][y]>1) {
                    sq++;
                }
            }
        }
        return sq;
    }

    private void testData() {
        claims.clear();
        claims.add(new FabricClaim("#1",1,3,4,4));
        claims.add(new FabricClaim("#2",3,1,4,4));
        claims.add(new FabricClaim("#3",5,5,2,2));
    }

    private void printCloth() {
        for (int x = 0; x < CLOTHSIZE; x++) {
            for (int y = 0; y < CLOTHSIZE; y++) {
                System.out.print(cloth[x][y]);
            }
            System.out.println();
        }
    }

    private void printMaxDimension() {
        int maxX = 0;
        int maxY = 0;
        for (int i = 0; i < claims.size() ; i++) {
            FabricClaim c = claims.get(i);
            int x = c.getX() + c.getWidth();
            maxX = x > maxX ? x : maxX;
            int y = c.getY() + c.getHeigth();
            maxY = y > maxY ? y : maxY;
        }
        log.info("Max dimension: {},{}",maxX+1, maxY+1);
    }
}



