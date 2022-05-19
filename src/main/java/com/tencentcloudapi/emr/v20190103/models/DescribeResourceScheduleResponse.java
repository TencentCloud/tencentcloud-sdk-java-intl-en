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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeResourceScheduleResponse extends AbstractModel{

    /**
    * Whether to enable the resource scheduling feature
    */
    @SerializedName("OpenSwitch")
    @Expose
    private Boolean OpenSwitch;

    /**
    * The resource scheduler in service
    */
    @SerializedName("Scheduler")
    @Expose
    private String Scheduler;

    /**
    * Fair Scheduler information
    */
    @SerializedName("FSInfo")
    @Expose
    private String FSInfo;

    /**
    * Capacity Scheduler information
    */
    @SerializedName("CSInfo")
    @Expose
    private String CSInfo;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Whether to enable the resource scheduling feature 
     * @return OpenSwitch Whether to enable the resource scheduling feature
     */
    public Boolean getOpenSwitch() {
        return this.OpenSwitch;
    }

    /**
     * Set Whether to enable the resource scheduling feature
     * @param OpenSwitch Whether to enable the resource scheduling feature
     */
    public void setOpenSwitch(Boolean OpenSwitch) {
        this.OpenSwitch = OpenSwitch;
    }

    /**
     * Get The resource scheduler in service 
     * @return Scheduler The resource scheduler in service
     */
    public String getScheduler() {
        return this.Scheduler;
    }

    /**
     * Set The resource scheduler in service
     * @param Scheduler The resource scheduler in service
     */
    public void setScheduler(String Scheduler) {
        this.Scheduler = Scheduler;
    }

    /**
     * Get Fair Scheduler information 
     * @return FSInfo Fair Scheduler information
     */
    public String getFSInfo() {
        return this.FSInfo;
    }

    /**
     * Set Fair Scheduler information
     * @param FSInfo Fair Scheduler information
     */
    public void setFSInfo(String FSInfo) {
        this.FSInfo = FSInfo;
    }

    /**
     * Get Capacity Scheduler information 
     * @return CSInfo Capacity Scheduler information
     */
    public String getCSInfo() {
        return this.CSInfo;
    }

    /**
     * Set Capacity Scheduler information
     * @param CSInfo Capacity Scheduler information
     */
    public void setCSInfo(String CSInfo) {
        this.CSInfo = CSInfo;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeResourceScheduleResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeResourceScheduleResponse(DescribeResourceScheduleResponse source) {
        if (source.OpenSwitch != null) {
            this.OpenSwitch = new Boolean(source.OpenSwitch);
        }
        if (source.Scheduler != null) {
            this.Scheduler = new String(source.Scheduler);
        }
        if (source.FSInfo != null) {
            this.FSInfo = new String(source.FSInfo);
        }
        if (source.CSInfo != null) {
            this.CSInfo = new String(source.CSInfo);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OpenSwitch", this.OpenSwitch);
        this.setParamSimple(map, prefix + "Scheduler", this.Scheduler);
        this.setParamSimple(map, prefix + "FSInfo", this.FSInfo);
        this.setParamSimple(map, prefix + "CSInfo", this.CSInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

