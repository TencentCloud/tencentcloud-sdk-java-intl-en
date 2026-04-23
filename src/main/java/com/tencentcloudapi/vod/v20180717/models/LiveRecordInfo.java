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
    * <p>Live streaming Recording domain name</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>Live streaming Recording Path</p>
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * <p>Live recording stream ID.</p>
    */
    @SerializedName("StreamId")
    @Expose
    private String StreamId;

    /**
    * <p>Recording start time in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO datetime format</a>.</p>
    */
    @SerializedName("RecordStartTime")
    @Expose
    private String RecordStartTime;

    /**
    * <p>Recording end time, using <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
    */
    @SerializedName("RecordEndTime")
    @Expose
    private String RecordEndTime;

    /**
     * Get <p>Live streaming Recording domain name</p> 
     * @return Domain <p>Live streaming Recording domain name</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>Live streaming Recording domain name</p>
     * @param Domain <p>Live streaming Recording domain name</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>Live streaming Recording Path</p> 
     * @return Path <p>Live streaming Recording Path</p>
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set <p>Live streaming Recording Path</p>
     * @param Path <p>Live streaming Recording Path</p>
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get <p>Live recording stream ID.</p> 
     * @return StreamId <p>Live recording stream ID.</p>
     */
    public String getStreamId() {
        return this.StreamId;
    }

    /**
     * Set <p>Live recording stream ID.</p>
     * @param StreamId <p>Live recording stream ID.</p>
     */
    public void setStreamId(String StreamId) {
        this.StreamId = StreamId;
    }

    /**
     * Get <p>Recording start time in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO datetime format</a>.</p> 
     * @return RecordStartTime <p>Recording start time in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO datetime format</a>.</p>
     */
    public String getRecordStartTime() {
        return this.RecordStartTime;
    }

    /**
     * Set <p>Recording start time in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO datetime format</a>.</p>
     * @param RecordStartTime <p>Recording start time in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO datetime format</a>.</p>
     */
    public void setRecordStartTime(String RecordStartTime) {
        this.RecordStartTime = RecordStartTime;
    }

    /**
     * Get <p>Recording end time, using <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p> 
     * @return RecordEndTime <p>Recording end time, using <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
     */
    public String getRecordEndTime() {
        return this.RecordEndTime;
    }

    /**
     * Set <p>Recording end time, using <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
     * @param RecordEndTime <p>Recording end time, using <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
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

