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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDatahubTopicResp extends AbstractModel {

    /**
    * Name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Topic name
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * Topic ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * The number of partitions
    */
    @SerializedName("PartitionNum")
    @Expose
    private Long PartitionNum;

    /**
    * Expiration time in milliseconds.
    */
    @SerializedName("RetentionMs")
    @Expose
    private Long RetentionMs;

    /**
    * Remarks.
    */
    @SerializedName("Note")
    @Expose
    private String Note;

    /**
    * Username
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Password
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * Status (`1`: In use; `2`: Deleting)
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Specifies the service routing address.
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
     * Get Name 
     * @return Name Name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name
     * @param Name Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Topic name 
     * @return TopicName Topic name
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Topic name
     * @param TopicName Topic name
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get Topic ID 
     * @return TopicId Topic ID
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Topic ID
     * @param TopicId Topic ID
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get The number of partitions 
     * @return PartitionNum The number of partitions
     */
    public Long getPartitionNum() {
        return this.PartitionNum;
    }

    /**
     * Set The number of partitions
     * @param PartitionNum The number of partitions
     */
    public void setPartitionNum(Long PartitionNum) {
        this.PartitionNum = PartitionNum;
    }

    /**
     * Get Expiration time in milliseconds. 
     * @return RetentionMs Expiration time in milliseconds.
     */
    public Long getRetentionMs() {
        return this.RetentionMs;
    }

    /**
     * Set Expiration time in milliseconds.
     * @param RetentionMs Expiration time in milliseconds.
     */
    public void setRetentionMs(Long RetentionMs) {
        this.RetentionMs = RetentionMs;
    }

    /**
     * Get Remarks. 
     * @return Note Remarks.
     */
    public String getNote() {
        return this.Note;
    }

    /**
     * Set Remarks.
     * @param Note Remarks.
     */
    public void setNote(String Note) {
        this.Note = Note;
    }

    /**
     * Get Username 
     * @return UserName Username
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Username
     * @param UserName Username
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Password 
     * @return Password Password
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Password
     * @param Password Password
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get Status (`1`: In use; `2`: Deleting) 
     * @return Status Status (`1`: In use; `2`: Deleting)
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status (`1`: In use; `2`: Deleting)
     * @param Status Status (`1`: In use; `2`: Deleting)
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Specifies the service routing address. 
     * @return Address Specifies the service routing address.
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set Specifies the service routing address.
     * @param Address Specifies the service routing address.
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    public DescribeDatahubTopicResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDatahubTopicResp(DescribeDatahubTopicResp source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.PartitionNum != null) {
            this.PartitionNum = new Long(source.PartitionNum);
        }
        if (source.RetentionMs != null) {
            this.RetentionMs = new Long(source.RetentionMs);
        }
        if (source.Note != null) {
            this.Note = new String(source.Note);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "PartitionNum", this.PartitionNum);
        this.setParamSimple(map, prefix + "RetentionMs", this.RetentionMs);
        this.setParamSimple(map, prefix + "Note", this.Note);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Address", this.Address);

    }
}

