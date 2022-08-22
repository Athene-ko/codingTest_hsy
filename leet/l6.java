public class l6 {
        public String convert(String s, int numRows) {
            int groupSize = numRows ==1 ? s.length() : numRows * 2 - 2;
            int groupNum = s.length() / groupSize; // 그룹갯수
            int remain = (s.length() % groupSize);
    
            // 첫번째 줄 문자수 = groupNum + (ramin>=1 ? 1 : 0);
            int line1Size = groupNum + (remain >= 1 ? 1 : 0);
            // 마지막줄 문자수 = groupNum + (remain >= numRows ? 1 : 0);
            int lineListSize = numRows==1 ? 0 : groupNum + (remain >= numRows ? 1 : 0);
            // "AB" , 1 인 경우 포함
    
            // if s.length()=15, numRows=4 -> groupSize = 6, groupNum = 2, remain =4
            // 첫번재 줄 문자의 index = 0, 6, 12 ( groupSize씩 증가)
            // 마지막 줄 문자의 index = 3, 9,
    
            // if s.length()=15, numRows=3 -> groupSize = 4, groupNum = 3, remain =3
            // 첫번재 줄 문자의 index = 0, 4, 8, 12
            // 마지막 줄 문자의 index = 2, 6, 10
    
            StringBuilder line1 = new StringBuilder();
            for (int i = 0; i < line1Size; i++) {
                int idx = i * groupSize;
                line1.append(s.charAt(idx));
            }
            System.out.println(line1);
    
            StringBuilder lineLast = new StringBuilder();
            for (int i = 0; i < lineListSize; i++) {
                int idx = numRows-1 + i * groupSize;
                lineLast.append(s.charAt(idx));
            }
            // System.out.println(lineLast); // numRows 0이면 null
          
            StringBuilder fsb = new StringBuilder();
            fsb.append(line1.toString());
          
            // 중간 line 갯수 = numRows - 2;
            for (int i = 0; i < numRows-2; i++) {
                StringBuilder ml = new StringBuilder();
                // index : (0, 1 * groupSize), (1*groupSize, 2*groupSize)
                for (int j = 0; j < groupNum; j++) {
                    String group = s.substring(j * groupSize, (j + 1) * groupSize);
                    System.out.println(String.format("line %d / group %d : %s" ,i+2,j, group));
                    // i=0 이면 두번째줄 1, last. i = 1이면 세번째 줄 idx = 2 & last-1
                    ml.append(group.substring(i+1, i+2));
                    ml.append(group.substring(group.length()-1-(i)).charAt(0));
                }
                String remainGroup = s.substring(groupNum*groupSize);
                System.out.println(String.format("remain group : %s", remainGroup));
                if (remainGroup.length() > i + 1) {
                    if (remainGroup.length() <= numRows) {
                      ml.append(remainGroup.substring(i+1,i+2));
                    } else if (remainGroup.length() > numRows && remainGroup.length() < groupSize) {
                      ml.append(remainGroup.substring(i+1,i+2));
                      String tail = remainGroup.substring(numRows);
                      tail.length();
                      ml.append(remainGroup.substring(groupSize-1-(i)).charAt(0));
                    }
                }
                // System.out.println(ml);
                fsb.append(ml.toString());
            }
            fsb.append(lineLast.toString());
    
            System.out.println("===============");
            return fsb.toString();
        }
}
