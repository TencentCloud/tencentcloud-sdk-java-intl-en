/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTendisSlowLogRequest extends AbstractModel {

    /**
    * Instance ID in the format of crs-ngvou0i1
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Start time in the format of 2019-09-08 12:12:41
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * End time in the format of 2019-09-09 12:12:41
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Slow query threshold in ms
    */
    @SerializedName("MinQueryTime")
    @Expose
    private Long MinQueryTime;

    /**
    * Maximum number of results returned per page. Default value: 20.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset, which is an integral multiple of `Limit`.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get Instance ID in the format of crs-ngvou0i1 
     * @return InstanceId Instance ID in the format of crs-ngvou0i1
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID in the format of crs-ngvou0i1
     * @param InstanceId Instance ID in the format of crs-ngvou0i1
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Start time in the format of 2019-09-08 12:12:41 
     * @return BeginTime Start time in the format of 2019-09-08 12:12:41
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set Start time in the format of 2019-09-08 12:12:41
     * @param BeginTime Start time in the format of 2019-09-08 12:12:41
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get End time in the format of 2019-09-09 12:12:41 
     * @return EndTime End time in the format of 2019-09-09 12:12:41
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time in the format of 2019-09-09 12:12:41
     * @param EndTime End time in the format of 2019-09-09 12:12:41
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Slow query threshold in ms 
     * @return MinQueryTime Slow query threshold in ms
     */
    public Long getMinQueryTime() {
        return this.MinQueryTime;
    }

    /**
     * Set Slow query threshold in ms
     * @param MinQueryTime Slow query threshold in ms
     */
    public void setMinQueryTime(Long MinQueryTime) {
        this.MinQueryTime = MinQueryTime;
    }

    /**
     * Get Maximum number of results returned per page. Default value: 20. 
     * @return Limit Maximum number of results returned per page. Default value: 20.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Maximum number of results returned per page. Default value: 20.
     * @param Limit Maximum number of results returned per page. Default value: 20.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset, which is an integral multiple of `Limit`. 
     * @return Offset Offset, which is an integral multiple of `Limit`.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset, which is an integral multiple of `Limit`.
     * @param Offset Offset, which is an integral multiple of `Limit`.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeTendisSlowLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTendisSlowLogRequest(DescribeTendisSlowLogRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.MinQueryTime != null) {
            this.MinQueryTime = new Long(source.MinQueryTime);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "MinQueryTime", this.MinQueryTime);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

