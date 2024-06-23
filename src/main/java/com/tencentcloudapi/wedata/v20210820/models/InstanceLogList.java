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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceLogList extends AbstractModel {

    /**
    * Task IDNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Data TimestampNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CurRunDate")
    @Expose
    private String CurRunDate;

    /**
    * Maximum number of retriesNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Tries")
    @Expose
    private String Tries;

    /**
    * Last Updated TimeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("LastUpdate")
    @Expose
    private String LastUpdate;

    /**
    * Node IP
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("BrokerIp")
    @Expose
    private String BrokerIp;

    /**
    * File sizeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("FileSize")
    @Expose
    private String FileSize;

    /**
    * Original File Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("OriginFileName")
    @Expose
    private String OriginFileName;

    /**
    * Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Instance Log Type
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("InstanceLogType")
    @Expose
    private String InstanceLogType;

    /**
    * Task NameNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * Time Consumed
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CostTime")
    @Expose
    private String CostTime;

    /**
     * Get Task IDNote: This field may return null, indicating that no valid value can be obtained. 
     * @return TaskId Task IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task IDNote: This field may return null, indicating that no valid value can be obtained.
     * @param TaskId Task IDNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Data TimestampNote: This field may return null, indicating that no valid value can be obtained. 
     * @return CurRunDate Data TimestampNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCurRunDate() {
        return this.CurRunDate;
    }

    /**
     * Set Data TimestampNote: This field may return null, indicating that no valid value can be obtained.
     * @param CurRunDate Data TimestampNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCurRunDate(String CurRunDate) {
        this.CurRunDate = CurRunDate;
    }

    /**
     * Get Maximum number of retriesNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Tries Maximum number of retriesNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTries() {
        return this.Tries;
    }

    /**
     * Set Maximum number of retriesNote: This field may return null, indicating that no valid value can be obtained.
     * @param Tries Maximum number of retriesNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTries(String Tries) {
        this.Tries = Tries;
    }

    /**
     * Get Last Updated TimeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return LastUpdate Last Updated TimeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getLastUpdate() {
        return this.LastUpdate;
    }

    /**
     * Set Last Updated TimeNote: This field may return null, indicating that no valid value can be obtained.
     * @param LastUpdate Last Updated TimeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setLastUpdate(String LastUpdate) {
        this.LastUpdate = LastUpdate;
    }

    /**
     * Get Node IP
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return BrokerIp Node IP
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getBrokerIp() {
        return this.BrokerIp;
    }

    /**
     * Set Node IP
Note: This field may return null, indicating that no valid value can be obtained.
     * @param BrokerIp Node IP
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setBrokerIp(String BrokerIp) {
        this.BrokerIp = BrokerIp;
    }

    /**
     * Get File sizeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return FileSize File sizeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getFileSize() {
        return this.FileSize;
    }

    /**
     * Set File sizeNote: This field may return null, indicating that no valid value can be obtained.
     * @param FileSize File sizeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setFileSize(String FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get Original File Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return OriginFileName Original File Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getOriginFileName() {
        return this.OriginFileName;
    }

    /**
     * Set Original File Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param OriginFileName Original File Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setOriginFileName(String OriginFileName) {
        this.OriginFileName = OriginFileName;
    }

    /**
     * Get Creation TimeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return CreateTime Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
     * @param CreateTime Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Instance Log Type
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return InstanceLogType Instance Log Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getInstanceLogType() {
        return this.InstanceLogType;
    }

    /**
     * Set Instance Log Type
Note: This field may return null, indicating that no valid value can be obtained.
     * @param InstanceLogType Instance Log Type
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setInstanceLogType(String InstanceLogType) {
        this.InstanceLogType = InstanceLogType;
    }

    /**
     * Get Task NameNote: This field may return null, indicating that no valid value can be obtained. 
     * @return TaskName Task NameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set Task NameNote: This field may return null, indicating that no valid value can be obtained.
     * @param TaskName Task NameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get Time Consumed
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CostTime Time Consumed
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCostTime() {
        return this.CostTime;
    }

    /**
     * Set Time Consumed
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CostTime Time Consumed
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCostTime(String CostTime) {
        this.CostTime = CostTime;
    }

    public InstanceLogList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceLogList(InstanceLogList source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.CurRunDate != null) {
            this.CurRunDate = new String(source.CurRunDate);
        }
        if (source.Tries != null) {
            this.Tries = new String(source.Tries);
        }
        if (source.LastUpdate != null) {
            this.LastUpdate = new String(source.LastUpdate);
        }
        if (source.BrokerIp != null) {
            this.BrokerIp = new String(source.BrokerIp);
        }
        if (source.FileSize != null) {
            this.FileSize = new String(source.FileSize);
        }
        if (source.OriginFileName != null) {
            this.OriginFileName = new String(source.OriginFileName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.InstanceLogType != null) {
            this.InstanceLogType = new String(source.InstanceLogType);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.CostTime != null) {
            this.CostTime = new String(source.CostTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "CurRunDate", this.CurRunDate);
        this.setParamSimple(map, prefix + "Tries", this.Tries);
        this.setParamSimple(map, prefix + "LastUpdate", this.LastUpdate);
        this.setParamSimple(map, prefix + "BrokerIp", this.BrokerIp);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "OriginFileName", this.OriginFileName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "InstanceLogType", this.InstanceLogType);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "CostTime", this.CostTime);

    }
}

