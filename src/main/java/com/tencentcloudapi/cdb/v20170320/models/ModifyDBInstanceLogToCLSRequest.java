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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDBInstanceLogToCLSRequest extends AbstractModel {

    /**
    * Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Log type. error: error log. slowlog: slow log.
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * Delivery status. ON: Enabled, OFF: Disabled.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Whether required to create logset. Default to false.
    */
    @SerializedName("CreateLogset")
    @Expose
    private Boolean CreateLogset;

    /**
    * Logset name when creating a logset; logset ID when selecting an existing log set. Empty by default.
Description: When the parameter Status is set to ON, you must fill in either the Logset or LogTopic parameter.
    */
    @SerializedName("Logset")
    @Expose
    private String Logset;

    /**
    * Whether required to create log topic. Default to false.
    */
    @SerializedName("CreateLogTopic")
    @Expose
    private Boolean CreateLogTopic;

    /**
    * Log topic name when creating a log topic; log topic ID when selecting an existing log topic. Empty by default.
Description: When the parameter Status is set to ON, you must fill in either the Logset or LogTopic parameter.
    */
    @SerializedName("LogTopic")
    @Expose
    private String LogTopic;

    /**
    * Log topic valid period. Default value: 30 days if left empty. Maximum value: 3600.
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * Whether to create an index when creating a log topic. Default to false.
    */
    @SerializedName("CreateIndex")
    @Expose
    private Boolean CreateIndex;

    /**
    * The region of CLS. If left empty, it defaults to the parameter value of Region.
    */
    @SerializedName("ClsRegion")
    @Expose
    private String ClsRegion;

    /**
     * Get Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API. 
     * @return InstanceId Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
     * @param InstanceId Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Log type. error: error log. slowlog: slow log. 
     * @return LogType Log type. error: error log. slowlog: slow log.
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set Log type. error: error log. slowlog: slow log.
     * @param LogType Log type. error: error log. slowlog: slow log.
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get Delivery status. ON: Enabled, OFF: Disabled. 
     * @return Status Delivery status. ON: Enabled, OFF: Disabled.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Delivery status. ON: Enabled, OFF: Disabled.
     * @param Status Delivery status. ON: Enabled, OFF: Disabled.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Whether required to create logset. Default to false. 
     * @return CreateLogset Whether required to create logset. Default to false.
     */
    public Boolean getCreateLogset() {
        return this.CreateLogset;
    }

    /**
     * Set Whether required to create logset. Default to false.
     * @param CreateLogset Whether required to create logset. Default to false.
     */
    public void setCreateLogset(Boolean CreateLogset) {
        this.CreateLogset = CreateLogset;
    }

    /**
     * Get Logset name when creating a logset; logset ID when selecting an existing log set. Empty by default.
Description: When the parameter Status is set to ON, you must fill in either the Logset or LogTopic parameter. 
     * @return Logset Logset name when creating a logset; logset ID when selecting an existing log set. Empty by default.
Description: When the parameter Status is set to ON, you must fill in either the Logset or LogTopic parameter.
     */
    public String getLogset() {
        return this.Logset;
    }

    /**
     * Set Logset name when creating a logset; logset ID when selecting an existing log set. Empty by default.
Description: When the parameter Status is set to ON, you must fill in either the Logset or LogTopic parameter.
     * @param Logset Logset name when creating a logset; logset ID when selecting an existing log set. Empty by default.
Description: When the parameter Status is set to ON, you must fill in either the Logset or LogTopic parameter.
     */
    public void setLogset(String Logset) {
        this.Logset = Logset;
    }

    /**
     * Get Whether required to create log topic. Default to false. 
     * @return CreateLogTopic Whether required to create log topic. Default to false.
     */
    public Boolean getCreateLogTopic() {
        return this.CreateLogTopic;
    }

    /**
     * Set Whether required to create log topic. Default to false.
     * @param CreateLogTopic Whether required to create log topic. Default to false.
     */
    public void setCreateLogTopic(Boolean CreateLogTopic) {
        this.CreateLogTopic = CreateLogTopic;
    }

    /**
     * Get Log topic name when creating a log topic; log topic ID when selecting an existing log topic. Empty by default.
Description: When the parameter Status is set to ON, you must fill in either the Logset or LogTopic parameter. 
     * @return LogTopic Log topic name when creating a log topic; log topic ID when selecting an existing log topic. Empty by default.
Description: When the parameter Status is set to ON, you must fill in either the Logset or LogTopic parameter.
     */
    public String getLogTopic() {
        return this.LogTopic;
    }

    /**
     * Set Log topic name when creating a log topic; log topic ID when selecting an existing log topic. Empty by default.
Description: When the parameter Status is set to ON, you must fill in either the Logset or LogTopic parameter.
     * @param LogTopic Log topic name when creating a log topic; log topic ID when selecting an existing log topic. Empty by default.
Description: When the parameter Status is set to ON, you must fill in either the Logset or LogTopic parameter.
     */
    public void setLogTopic(String LogTopic) {
        this.LogTopic = LogTopic;
    }

    /**
     * Get Log topic valid period. Default value: 30 days if left empty. Maximum value: 3600. 
     * @return Period Log topic valid period. Default value: 30 days if left empty. Maximum value: 3600.
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Log topic valid period. Default value: 30 days if left empty. Maximum value: 3600.
     * @param Period Log topic valid period. Default value: 30 days if left empty. Maximum value: 3600.
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get Whether to create an index when creating a log topic. Default to false. 
     * @return CreateIndex Whether to create an index when creating a log topic. Default to false.
     */
    public Boolean getCreateIndex() {
        return this.CreateIndex;
    }

    /**
     * Set Whether to create an index when creating a log topic. Default to false.
     * @param CreateIndex Whether to create an index when creating a log topic. Default to false.
     */
    public void setCreateIndex(Boolean CreateIndex) {
        this.CreateIndex = CreateIndex;
    }

    /**
     * Get The region of CLS. If left empty, it defaults to the parameter value of Region. 
     * @return ClsRegion The region of CLS. If left empty, it defaults to the parameter value of Region.
     */
    public String getClsRegion() {
        return this.ClsRegion;
    }

    /**
     * Set The region of CLS. If left empty, it defaults to the parameter value of Region.
     * @param ClsRegion The region of CLS. If left empty, it defaults to the parameter value of Region.
     */
    public void setClsRegion(String ClsRegion) {
        this.ClsRegion = ClsRegion;
    }

    public ModifyDBInstanceLogToCLSRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDBInstanceLogToCLSRequest(ModifyDBInstanceLogToCLSRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreateLogset != null) {
            this.CreateLogset = new Boolean(source.CreateLogset);
        }
        if (source.Logset != null) {
            this.Logset = new String(source.Logset);
        }
        if (source.CreateLogTopic != null) {
            this.CreateLogTopic = new Boolean(source.CreateLogTopic);
        }
        if (source.LogTopic != null) {
            this.LogTopic = new String(source.LogTopic);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.CreateIndex != null) {
            this.CreateIndex = new Boolean(source.CreateIndex);
        }
        if (source.ClsRegion != null) {
            this.ClsRegion = new String(source.ClsRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateLogset", this.CreateLogset);
        this.setParamSimple(map, prefix + "Logset", this.Logset);
        this.setParamSimple(map, prefix + "CreateLogTopic", this.CreateLogTopic);
        this.setParamSimple(map, prefix + "LogTopic", this.LogTopic);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "CreateIndex", this.CreateIndex);
        this.setParamSimple(map, prefix + "ClsRegion", this.ClsRegion);

    }
}

