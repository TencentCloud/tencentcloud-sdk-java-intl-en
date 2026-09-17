/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DailyPlayStatInfo extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * 
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 
    */
    @SerializedName("PlayTimes")
    @Expose
    private Long PlayTimes;

    /**
    * 
    */
    @SerializedName("Traffic")
    @Expose
    private Long Traffic;

    /**
     * Get  
     * @return Date 
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 
     * @param Date 
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get  
     * @return FileId 
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set 
     * @param FileId 
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get  
     * @return PlayTimes 
     */
    public Long getPlayTimes() {
        return this.PlayTimes;
    }

    /**
     * Set 
     * @param PlayTimes 
     */
    public void setPlayTimes(Long PlayTimes) {
        this.PlayTimes = PlayTimes;
    }

    /**
     * Get  
     * @return Traffic 
     */
    public Long getTraffic() {
        return this.Traffic;
    }

    /**
     * Set 
     * @param Traffic 
     */
    public void setTraffic(Long Traffic) {
        this.Traffic = Traffic;
    }

    public DailyPlayStatInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DailyPlayStatInfo(DailyPlayStatInfo source) {
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.PlayTimes != null) {
            this.PlayTimes = new Long(source.PlayTimes);
        }
        if (source.Traffic != null) {
            this.Traffic = new Long(source.Traffic);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "PlayTimes", this.PlayTimes);
        this.setParamSimple(map, prefix + "Traffic", this.Traffic);

    }
}

