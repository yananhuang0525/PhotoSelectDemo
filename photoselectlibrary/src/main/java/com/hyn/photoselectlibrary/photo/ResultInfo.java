package com.hyn.photoselectlibrary.photo;

/**
 * Created by Administrator on 2015/11/23 0023.
 */
public class ResultInfo {
    /**
     * 图片是否处理完成
     */
    private boolean isDealFainished;
    /**
     * 图片保存路径 仅当isDealFainished属性为true时有值
     */
    private String filePath;

    public boolean isDealFainished() {
        return isDealFainished;
    }

    public void setIsDealFainished(boolean isDealFainished) {
        this.isDealFainished = isDealFainished;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

}
