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
package com.tencentcloudapi.cloudaudit.v20190319.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRecorderResponse extends AbstractModel{

    /**
    * Whether to enable the recorder. Valid values: true (enable), false (disable).
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * Recorder name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Last error message of the recorder, which corresponds to `LastErrorCode`.
    */
    @SerializedName("LastErrorMessage")
    @Expose
    private String LastErrorMessage;

    /**
    * The status of the recorder when it recorded information last time. Valid values: PENDING, OK, FAILED.
    */
    @SerializedName("LastStatus")
    @Expose
    private String LastStatus;

    /**
    * List of the resource types monitored by the recorder
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceTypes")
    @Expose
    private RecordResourceType [] ResourceTypes;

    /**
    * Time when the recorder was enabled last time
    */
    @SerializedName("LastStartTime")
    @Expose
    private String LastStartTime;

    /**
    * Last error code of the recorder
    */
    @SerializedName("LastErrorCode")
    @Expose
    private String LastErrorCode;

    /**
    * Time when the recorder was disabled last time
    */
    @SerializedName("LastStopTime")
    @Expose
    private String LastStopTime;

    /**
    * Whether to monitor all currently supported resource types. Valid values: true (yes), false (no).
    */
    @SerializedName("AllSupported")
    @Expose
    private Boolean AllSupported;

    /**
    * Recorder creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Role name authorized to CFA
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Whether to enable the recorder. Valid values: true (enable), false (disable). 
     * @return Enable Whether to enable the recorder. Valid values: true (enable), false (disable).
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set Whether to enable the recorder. Valid values: true (enable), false (disable).
     * @param Enable Whether to enable the recorder. Valid values: true (enable), false (disable).
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get Recorder name 
     * @return Name Recorder name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Recorder name
     * @param Name Recorder name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Last error message of the recorder, which corresponds to `LastErrorCode`. 
     * @return LastErrorMessage Last error message of the recorder, which corresponds to `LastErrorCode`.
     */
    public String getLastErrorMessage() {
        return this.LastErrorMessage;
    }

    /**
     * Set Last error message of the recorder, which corresponds to `LastErrorCode`.
     * @param LastErrorMessage Last error message of the recorder, which corresponds to `LastErrorCode`.
     */
    public void setLastErrorMessage(String LastErrorMessage) {
        this.LastErrorMessage = LastErrorMessage;
    }

    /**
     * Get The status of the recorder when it recorded information last time. Valid values: PENDING, OK, FAILED. 
     * @return LastStatus The status of the recorder when it recorded information last time. Valid values: PENDING, OK, FAILED.
     */
    public String getLastStatus() {
        return this.LastStatus;
    }

    /**
     * Set The status of the recorder when it recorded information last time. Valid values: PENDING, OK, FAILED.
     * @param LastStatus The status of the recorder when it recorded information last time. Valid values: PENDING, OK, FAILED.
     */
    public void setLastStatus(String LastStatus) {
        this.LastStatus = LastStatus;
    }

    /**
     * Get List of the resource types monitored by the recorder
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ResourceTypes List of the resource types monitored by the recorder
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public RecordResourceType [] getResourceTypes() {
        return this.ResourceTypes;
    }

    /**
     * Set List of the resource types monitored by the recorder
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ResourceTypes List of the resource types monitored by the recorder
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setResourceTypes(RecordResourceType [] ResourceTypes) {
        this.ResourceTypes = ResourceTypes;
    }

    /**
     * Get Time when the recorder was enabled last time 
     * @return LastStartTime Time when the recorder was enabled last time
     */
    public String getLastStartTime() {
        return this.LastStartTime;
    }

    /**
     * Set Time when the recorder was enabled last time
     * @param LastStartTime Time when the recorder was enabled last time
     */
    public void setLastStartTime(String LastStartTime) {
        this.LastStartTime = LastStartTime;
    }

    /**
     * Get Last error code of the recorder 
     * @return LastErrorCode Last error code of the recorder
     */
    public String getLastErrorCode() {
        return this.LastErrorCode;
    }

    /**
     * Set Last error code of the recorder
     * @param LastErrorCode Last error code of the recorder
     */
    public void setLastErrorCode(String LastErrorCode) {
        this.LastErrorCode = LastErrorCode;
    }

    /**
     * Get Time when the recorder was disabled last time 
     * @return LastStopTime Time when the recorder was disabled last time
     */
    public String getLastStopTime() {
        return this.LastStopTime;
    }

    /**
     * Set Time when the recorder was disabled last time
     * @param LastStopTime Time when the recorder was disabled last time
     */
    public void setLastStopTime(String LastStopTime) {
        this.LastStopTime = LastStopTime;
    }

    /**
     * Get Whether to monitor all currently supported resource types. Valid values: true (yes), false (no). 
     * @return AllSupported Whether to monitor all currently supported resource types. Valid values: true (yes), false (no).
     */
    public Boolean getAllSupported() {
        return this.AllSupported;
    }

    /**
     * Set Whether to monitor all currently supported resource types. Valid values: true (yes), false (no).
     * @param AllSupported Whether to monitor all currently supported resource types. Valid values: true (yes), false (no).
     */
    public void setAllSupported(Boolean AllSupported) {
        this.AllSupported = AllSupported;
    }

    /**
     * Get Recorder creation time 
     * @return CreateTime Recorder creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Recorder creation time
     * @param CreateTime Recorder creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Role name authorized to CFA 
     * @return Role Role name authorized to CFA
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set Role name authorized to CFA
     * @param Role Role name authorized to CFA
     */
    public void setRole(String Role) {
        this.Role = Role;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "LastErrorMessage", this.LastErrorMessage);
        this.setParamSimple(map, prefix + "LastStatus", this.LastStatus);
        this.setParamArrayObj(map, prefix + "ResourceTypes.", this.ResourceTypes);
        this.setParamSimple(map, prefix + "LastStartTime", this.LastStartTime);
        this.setParamSimple(map, prefix + "LastErrorCode", this.LastErrorCode);
        this.setParamSimple(map, prefix + "LastStopTime", this.LastStopTime);
        this.setParamSimple(map, prefix + "AllSupported", this.AllSupported);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

