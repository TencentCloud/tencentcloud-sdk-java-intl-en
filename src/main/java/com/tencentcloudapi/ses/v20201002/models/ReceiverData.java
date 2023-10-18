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
package com.tencentcloudapi.ses.v20201002.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReceiverData extends AbstractModel {

    /**
    * Recipient group ID
    */
    @SerializedName("ReceiverId")
    @Expose
    private Long ReceiverId;

    /**
    * Recipient group name
    */
    @SerializedName("ReceiversName")
    @Expose
    private String ReceiversName;

    /**
    * Total number of recipient email addresses
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Recipient group description
Note: This field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * Group status (`1`: to be uploaded; `2` uploading; `3` uploaded)
Note: This field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("ReceiversStatus")
    @Expose
    private Long ReceiversStatus;

    /**
    * Creation time, such as 2021-09-28 16:40:35
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get Recipient group ID 
     * @return ReceiverId Recipient group ID
     */
    public Long getReceiverId() {
        return this.ReceiverId;
    }

    /**
     * Set Recipient group ID
     * @param ReceiverId Recipient group ID
     */
    public void setReceiverId(Long ReceiverId) {
        this.ReceiverId = ReceiverId;
    }

    /**
     * Get Recipient group name 
     * @return ReceiversName Recipient group name
     */
    public String getReceiversName() {
        return this.ReceiversName;
    }

    /**
     * Set Recipient group name
     * @param ReceiversName Recipient group name
     */
    public void setReceiversName(String ReceiversName) {
        this.ReceiversName = ReceiversName;
    }

    /**
     * Get Total number of recipient email addresses 
     * @return Count Total number of recipient email addresses
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Total number of recipient email addresses
     * @param Count Total number of recipient email addresses
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Recipient group description
Note: This field may return `null`, indicating that no valid value can be found. 
     * @return Desc Recipient group description
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set Recipient group description
Note: This field may return `null`, indicating that no valid value can be found.
     * @param Desc Recipient group description
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get Group status (`1`: to be uploaded; `2` uploading; `3` uploaded)
Note: This field may return `null`, indicating that no valid value can be found. 
     * @return ReceiversStatus Group status (`1`: to be uploaded; `2` uploading; `3` uploaded)
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public Long getReceiversStatus() {
        return this.ReceiversStatus;
    }

    /**
     * Set Group status (`1`: to be uploaded; `2` uploading; `3` uploaded)
Note: This field may return `null`, indicating that no valid value can be found.
     * @param ReceiversStatus Group status (`1`: to be uploaded; `2` uploading; `3` uploaded)
Note: This field may return `null`, indicating that no valid value can be found.
     */
    public void setReceiversStatus(Long ReceiversStatus) {
        this.ReceiversStatus = ReceiversStatus;
    }

    /**
     * Get Creation time, such as 2021-09-28 16:40:35 
     * @return CreateTime Creation time, such as 2021-09-28 16:40:35
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time, such as 2021-09-28 16:40:35
     * @param CreateTime Creation time, such as 2021-09-28 16:40:35
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public ReceiverData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReceiverData(ReceiverData source) {
        if (source.ReceiverId != null) {
            this.ReceiverId = new Long(source.ReceiverId);
        }
        if (source.ReceiversName != null) {
            this.ReceiversName = new String(source.ReceiversName);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.ReceiversStatus != null) {
            this.ReceiversStatus = new Long(source.ReceiversStatus);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReceiverId", this.ReceiverId);
        this.setParamSimple(map, prefix + "ReceiversName", this.ReceiversName);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "ReceiversStatus", this.ReceiversStatus);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

