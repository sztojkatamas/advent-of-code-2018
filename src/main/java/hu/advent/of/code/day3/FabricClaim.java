package hu.advent.of.code.day3;

import lombok.Getter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@ToString
public class FabricClaim {

    @Getter
    private final String id;
    @Getter
    private final int x;
    @Getter
    private final int y;
    @Getter
    private final int width;
    @Getter
    private final int heigth;

    public FabricClaim(String id, int x, int y, int width, int height) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.width = width;
        this.heigth = height;
    }

    public FabricClaim(String[] xxx)
    {
        this.id = xxx[0].trim();
        this.x = Integer.parseInt(xxx[1].trim());
        this.y = Integer.parseInt(xxx[2].trim());
        this.width = Integer.parseInt(xxx[3].trim());
        this.heigth = Integer.parseInt(xxx[4].trim());
    }
}
