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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataEngineBasicInfo extends AbstractModel {

    /**
    * DataEngine name
    */
    @SerializedName("DataEngineName")
    @Expose
    private String DataEngineName;

    /**
    * Data engine status: -2: deleted; -1: failed; 0: initializing; 1: suspended; 2: running; 3: ready to delete; 4: deleting
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * Update time
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * Returned information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * Engine ID
    */
    @SerializedName("DataEngineId")
    @Expose
    private String DataEngineId;

    /**
    * Engine types, and the valid values are PrestoSQL, SparkSQL, and SparkBatch.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DataEngineType")
    @Expose
    private String DataEngineType;

    /**
    * User ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Account ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserUin")
    @Expose
    private String UserUin;

    /**
     * Get DataEngine name 
     * @return DataEngineName DataEngine name
     */
    public String getDataEngineName() {
        return this.DataEngineName;
    }

    /**
     * Set DataEngine name
     * @param DataEngineName DataEngine name
     */
    public void setDataEngineName(String DataEngineName) {
        this.DataEngineName = DataEngineName;
    }

    /**
     * Get Data engine status: -2: deleted; -1: failed; 0: initializing; 1: suspended; 2: running; 3: ready to delete; 4: deleting 
     * @return State Data engine status: -2: deleted; -1: failed; 0: initializing; 1: suspended; 2: running; 3: ready to delete; 4: deleting
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set Data engine status: -2: deleted; -1: failed; 0: initializing; 1: suspended; 2: running; 3: ready to delete; 4: deleting
     * @param State Data engine status: -2: deleted; -1: failed; 0: initializing; 1: suspended; 2: running; 3: ready to delete; 4: deleting
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Update time 
     * @return UpdateTime Update time
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time
     * @param UpdateTime Update time
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Returned information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Message Returned information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Returned information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Message Returned information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get Engine ID 
     * @return DataEngineId Engine ID
     */
    public String getDataEngineId() {
        return this.DataEngineId;
    }

    /**
     * Set Engine ID
     * @param DataEngineId Engine ID
     */
    public void setDataEngineId(String DataEngineId) {
        this.DataEngineId = DataEngineId;
    }

    /**
     * Get Engine types, and the valid values are PrestoSQL, SparkSQL, and SparkBatch.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DataEngineType Engine types, and the valid values are PrestoSQL, SparkSQL, and SparkBatch.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDataEngineType() {
        return this.DataEngineType;
    }

    /**
     * Set Engine types, and the valid values are PrestoSQL, SparkSQL, and SparkBatch.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DataEngineType Engine types, and the valid values are PrestoSQL, SparkSQL, and SparkBatch.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDataEngineType(String DataEngineType) {
        this.DataEngineType = DataEngineType;
    }

    /**
     * Get User ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AppId User ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set User ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AppId User ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Account ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserUin Account ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUserUin() {
        return this.UserUin;
    }

    /**
     * Set Account ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserUin Account ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserUin(String UserUin) {
        this.UserUin = UserUin;
    }

    public DataEngineBasicInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataEngineBasicInfo(DataEngineBasicInfo source) {
        if (source.DataEngineName != null) {
            this.DataEngineName = new String(source.DataEngineName);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.DataEngineId != null) {
            this.DataEngineId = new String(source.DataEngineId);
        }
        if (source.DataEngineType != null) {
            this.DataEngineType = new String(source.DataEngineType);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.UserUin != null) {
            this.UserUin = new String(source.UserUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataEngineName", this.DataEngineName);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "DataEngineId", this.DataEngineId);
        this.setParamSimple(map, prefix + "DataEngineType", this.DataEngineType);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "UserUin", this.UserUin);

    }
}

