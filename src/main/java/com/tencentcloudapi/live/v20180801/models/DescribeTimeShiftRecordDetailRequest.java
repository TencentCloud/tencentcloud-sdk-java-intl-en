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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTimeShiftRecordDetailRequest extends AbstractModel{

    /**
    * The push domain.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * The push path.
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * The stream name.
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * The start time, which must be a Unix timestamp.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * The end time, which must be a Unix timestamp. 
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * The group the push domain belongs to. You don’t need to specify this parameter if the domain doesn’t belong to any group or the group name is an empty string.
    */
    @SerializedName("DomainGroup")
    @Expose
    private String DomainGroup;

    /**
    * The transcoding template ID. You don’t need to specify this parameter if the transcoding template ID is `0`.
    */
    @SerializedName("TransCodeId")
    @Expose
    private Long TransCodeId;

    /**
     * Get The push domain. 
     * @return Domain The push domain.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set The push domain.
     * @param Domain The push domain.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get The push path. 
     * @return AppName The push path.
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set The push path.
     * @param AppName The push path.
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get The stream name. 
     * @return StreamName The stream name.
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * Set The stream name.
     * @param StreamName The stream name.
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    /**
     * Get The start time, which must be a Unix timestamp. 
     * @return StartTime The start time, which must be a Unix timestamp.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set The start time, which must be a Unix timestamp.
     * @param StartTime The start time, which must be a Unix timestamp.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get The end time, which must be a Unix timestamp.  
     * @return EndTime The end time, which must be a Unix timestamp. 
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set The end time, which must be a Unix timestamp. 
     * @param EndTime The end time, which must be a Unix timestamp. 
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get The group the push domain belongs to. You don’t need to specify this parameter if the domain doesn’t belong to any group or the group name is an empty string. 
     * @return DomainGroup The group the push domain belongs to. You don’t need to specify this parameter if the domain doesn’t belong to any group or the group name is an empty string.
     */
    public String getDomainGroup() {
        return this.DomainGroup;
    }

    /**
     * Set The group the push domain belongs to. You don’t need to specify this parameter if the domain doesn’t belong to any group or the group name is an empty string.
     * @param DomainGroup The group the push domain belongs to. You don’t need to specify this parameter if the domain doesn’t belong to any group or the group name is an empty string.
     */
    public void setDomainGroup(String DomainGroup) {
        this.DomainGroup = DomainGroup;
    }

    /**
     * Get The transcoding template ID. You don’t need to specify this parameter if the transcoding template ID is `0`. 
     * @return TransCodeId The transcoding template ID. You don’t need to specify this parameter if the transcoding template ID is `0`.
     */
    public Long getTransCodeId() {
        return this.TransCodeId;
    }

    /**
     * Set The transcoding template ID. You don’t need to specify this parameter if the transcoding template ID is `0`.
     * @param TransCodeId The transcoding template ID. You don’t need to specify this parameter if the transcoding template ID is `0`.
     */
    public void setTransCodeId(Long TransCodeId) {
        this.TransCodeId = TransCodeId;
    }

    public DescribeTimeShiftRecordDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTimeShiftRecordDetailRequest(DescribeTimeShiftRecordDetailRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.StreamName != null) {
            this.StreamName = new String(source.StreamName);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.DomainGroup != null) {
            this.DomainGroup = new String(source.DomainGroup);
        }
        if (source.TransCodeId != null) {
            this.TransCodeId = new Long(source.TransCodeId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "DomainGroup", this.DomainGroup);
        this.setParamSimple(map, prefix + "TransCodeId", this.TransCodeId);

    }
}

