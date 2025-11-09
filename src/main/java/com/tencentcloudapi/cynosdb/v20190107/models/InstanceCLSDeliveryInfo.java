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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceCLSDeliveryInfo extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance name


    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Log topic id.

    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Log topic name
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * Log set id.

    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Log set name.


    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * Log delivery region.

    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Delivery status: creating, running, offlining, offlined.

    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Log type.
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Instance name

 
     * @return InstanceName Instance name


     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name


     * @param InstanceName Instance name


     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Log topic id.
 
     * @return TopicId Log topic id.

     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Log topic id.

     * @param TopicId Log topic id.

     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Log topic name 
     * @return TopicName Log topic name
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Log topic name
     * @param TopicName Log topic name
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get Log set id.
 
     * @return GroupId Log set id.

     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Log set id.

     * @param GroupId Log set id.

     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Log set name.

 
     * @return GroupName Log set name.


     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set Log set name.


     * @param GroupName Log set name.


     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get Log delivery region.
 
     * @return Region Log delivery region.

     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Log delivery region.

     * @param Region Log delivery region.

     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Delivery status: creating, running, offlining, offlined.
 
     * @return Status Delivery status: creating, running, offlining, offlined.

     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Delivery status: creating, running, offlining, offlined.

     * @param Status Delivery status: creating, running, offlining, offlined.

     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Log type. 
     * @return LogType Log type.
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set Log type.
     * @param LogType Log type.
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    public InstanceCLSDeliveryInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceCLSDeliveryInfo(InstanceCLSDeliveryInfo source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "LogType", this.LogType);

    }
}

