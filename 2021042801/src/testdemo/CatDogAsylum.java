package testdemo;

import java.util.ArrayList;

/**
 * Created with Intellij IDEA
 * Description:
 * User: 23871
 * Date: 2021-04-28
 * Time: 16:40
 */
public class CatDogAsylum {
        public ArrayList<Integer> asylum(int[][] ope) {
            ArrayList<Integer> out = new ArrayList<>();
            ArrayList<Integer> intt = new ArrayList<>();
            int tmp=0;
            for (int i = 0; i < ope.length; i++) {
                switch (ope[i][0]) {
                    case 1:
                        intt.add(ope[i][1]);
                        break;
                    case 2:
                        if (!intt.isEmpty() && ope[i][1] == 0) {
                            out.add(intt.get(0));
                            intt.remove(0);
                            break;
                        }
                        if (!intt.isEmpty() && ope[i][1] == -1) {
                            for ( tmp = 0; tmp < intt.size(); tmp++) {
                                if (intt.get(tmp) < 0) {
                                    out.add(intt.get(tmp));
                                    intt.remove(tmp);
                                    break;
                                }
                            }
                        }
                        if (!intt.isEmpty() && ope[i][1] == 1) {
                            for (tmp=0; tmp < intt.size(); tmp++) {
                                if (intt.get(tmp) > 0) {
                                    out.add(intt.get(tmp));
                                    intt.remove(tmp);
                                    break;
                                }
                            }
                        }
                        break;
                }
            }
            return out;
        }

}
