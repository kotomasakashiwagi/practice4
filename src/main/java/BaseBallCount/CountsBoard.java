package BaseBallCount;

import java.util.EnumMap;

public class CountsBoard {
    //ストライクボールのカウントをMapで保持
    public EnumMap<Counts, Integer> countTable =
            new EnumMap<Counts, Integer>(Counts.class) {
                {
                    put(Counts.Ball, 0);
                    put(Counts.Strike, 0);
                }
            };

    //mapとカウントの種類をもらってカウントを足す。
    public static void putScore(EnumMap<Counts, Integer> countTable, Counts counts) {
        switch (counts) {
            case Strike:
            case Ball:
                countTable.put(counts, countTable.get(counts) + 1);
                break;
            case Foul:
                if (countTable.get(Counts.Strike) < 2) {
                    countTable.put(Counts.Strike, countTable.get(Counts.Strike) + 1);
                }
                break;
        }
        //同時に複数から呼ばれることはない
    }

    ;

}
