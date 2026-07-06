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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAlarmNotifyHistoriesRequest extends AbstractModel {

    /**
    * Monitoring type
    */
    @SerializedName("MonitorType")
    @Expose
    private String MonitorType;

    /**
    * Start time, used as a Unix timestamp in seconds.
    */
    @SerializedName("QueryBaseTime")
    @Expose
    private Long QueryBaseTime;

    /**
    * Period to query before QueryBaseTime, in seconds.
    */
    @SerializedName("QueryBeforeSeconds")
    @Expose
    private Long QueryBeforeSeconds;

    /**
    * Pagination parameter.
    */
    @SerializedName("PageParams")
    @Expose
    private PageByNoParams PageParams;

    /**
    * Fill in when the monitoring type is MT_QCE. Namespace of the affiliation.
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * Fill in when the monitoring type is MT_QCE. Alarm policy type
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * Query the notification history of a policy
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
     * Get Monitoring type 
     * @return MonitorType Monitoring type
     */
    public String getMonitorType() {
        return this.MonitorType;
    }

    /**
     * Set Monitoring type
     * @param MonitorType Monitoring type
     */
    public void setMonitorType(String MonitorType) {
        this.MonitorType = MonitorType;
    }

    /**
     * Get Start time, used as a Unix timestamp in seconds. 
     * @return QueryBaseTime Start time, used as a Unix timestamp in seconds.
     */
    public Long getQueryBaseTime() {
        return this.QueryBaseTime;
    }

    /**
     * Set Start time, used as a Unix timestamp in seconds.
     * @param QueryBaseTime Start time, used as a Unix timestamp in seconds.
     */
    public void setQueryBaseTime(Long QueryBaseTime) {
        this.QueryBaseTime = QueryBaseTime;
    }

    /**
     * Get Period to query before QueryBaseTime, in seconds. 
     * @return QueryBeforeSeconds Period to query before QueryBaseTime, in seconds.
     */
    public Long getQueryBeforeSeconds() {
        return this.QueryBeforeSeconds;
    }

    /**
     * Set Period to query before QueryBaseTime, in seconds.
     * @param QueryBeforeSeconds Period to query before QueryBaseTime, in seconds.
     */
    public void setQueryBeforeSeconds(Long QueryBeforeSeconds) {
        this.QueryBeforeSeconds = QueryBeforeSeconds;
    }

    /**
     * Get Pagination parameter. 
     * @return PageParams Pagination parameter.
     */
    public PageByNoParams getPageParams() {
        return this.PageParams;
    }

    /**
     * Set Pagination parameter.
     * @param PageParams Pagination parameter.
     */
    public void setPageParams(PageByNoParams PageParams) {
        this.PageParams = PageParams;
    }

    /**
     * Get Fill in when the monitoring type is MT_QCE. Namespace of the affiliation. 
     * @return Namespace Fill in when the monitoring type is MT_QCE. Namespace of the affiliation.
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Fill in when the monitoring type is MT_QCE. Namespace of the affiliation.
     * @param Namespace Fill in when the monitoring type is MT_QCE. Namespace of the affiliation.
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get Fill in when the monitoring type is MT_QCE. Alarm policy type 
     * @return ModelName Fill in when the monitoring type is MT_QCE. Alarm policy type
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set Fill in when the monitoring type is MT_QCE. Alarm policy type
     * @param ModelName Fill in when the monitoring type is MT_QCE. Alarm policy type
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get Query the notification history of a policy 
     * @return PolicyId Query the notification history of a policy
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set Query the notification history of a policy
     * @param PolicyId Query the notification history of a policy
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    public DescribeAlarmNotifyHistoriesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAlarmNotifyHistoriesRequest(DescribeAlarmNotifyHistoriesRequest source) {
        if (source.MonitorType != null) {
            this.MonitorType = new String(source.MonitorType);
        }
        if (source.QueryBaseTime != null) {
            this.QueryBaseTime = new Long(source.QueryBaseTime);
        }
        if (source.QueryBeforeSeconds != null) {
            this.QueryBeforeSeconds = new Long(source.QueryBeforeSeconds);
        }
        if (source.PageParams != null) {
            this.PageParams = new PageByNoParams(source.PageParams);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MonitorType", this.MonitorType);
        this.setParamSimple(map, prefix + "QueryBaseTime", this.QueryBaseTime);
        this.setParamSimple(map, prefix + "QueryBeforeSeconds", this.QueryBeforeSeconds);
        this.setParamObj(map, prefix + "PageParams.", this.PageParams);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);

    }
}

