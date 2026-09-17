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

public class LiveRecordInfo extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 
    */
    @SerializedName("StreamId")
    @Expose
    private String StreamId;

    /**
    * 
    */
    @SerializedName("RecordStartTime")
    @Expose
    private String RecordStartTime;

    /**
    * 
    */
    @SerializedName("RecordEndTime")
    @Expose
    private String RecordEndTime;

    /**
     * Get  
     * @return Domain 
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 
     * @param Domain 
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get  
     * @return Path 
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 
     * @param Path 
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get  
     * @return StreamId 
     */
    public String getStreamId() {
        return this.StreamId;
    }

    /**
     * Set 
     * @param StreamId 
     */
    public void setStreamId(String StreamId) {
        this.StreamId = StreamId;
    }

    /**
     * Get  
     * @return RecordStartTime 
     */
    public String getRecordStartTime() {
        return this.RecordStartTime;
    }

    /**
     * Set 
     * @param RecordStartTime 
     */
    public void setRecordStartTime(String RecordStartTime) {
        this.RecordStartTime = RecordStartTime;
    }

    /**
     * Get  
     * @return RecordEndTime 
     */
    public String getRecordEndTime() {
        return this.RecordEndTime;
    }

    /**
     * Set 
     * @param RecordEndTime 
     */
    public void setRecordEndTime(String RecordEndTime) {
        this.RecordEndTime = RecordEndTime;
    }

    public LiveRecordInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveRecordInfo(LiveRecordInfo source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.StreamId != null) {
            this.StreamId = new String(source.StreamId);
        }
        if (source.RecordStartTime != null) {
            this.RecordStartTime = new String(source.RecordStartTime);
        }
        if (source.RecordEndTime != null) {
            this.RecordEndTime = new String(source.RecordEndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "StreamId", this.StreamId);
        this.setParamSimple(map, prefix + "RecordStartTime", this.RecordStartTime);
        this.setParamSimple(map, prefix + "RecordEndTime", this.RecordEndTime);

    }
}

