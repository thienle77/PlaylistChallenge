package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        int forward = 0;
        int reverse = 0;
        for (int i = startIndex ; i < playList.length; i++){
            if (playList[i].equals(selection)){
                break;
            } else {
                forward++;
            }
        }
        return startIndex + 1;
    }
}
