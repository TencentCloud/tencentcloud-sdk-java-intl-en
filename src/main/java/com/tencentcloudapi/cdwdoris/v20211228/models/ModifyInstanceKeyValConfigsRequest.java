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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstanceKeyValConfigsRequest extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * File name
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * Add configuration list
    */
    @SerializedName("AddItems")
    @Expose
    private InstanceConfigItem [] AddItems;

    /**
    * Update configuration list
    */
    @SerializedName("UpdateItems")
    @Expose
    private InstanceConfigItem [] UpdateItems;

    /**
    * Delete configuration list
    */
    @SerializedName("DelItems")
    @Expose
    private InstanceConfigItem [] DelItems;

    /**
    * Remarks (within 50 words)
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * Hot update list
    */
    @SerializedName("HotUpdateItems")
    @Expose
    private InstanceConfigItem [] HotUpdateItems;

    /**
    * Delete configuration list
    */
    @SerializedName("DeleteItems")
    @Expose
    private InstanceConfigItem DeleteItems;

    /**
    * IP address
    */
    @SerializedName("IPAddress")
    @Expose
    private String IPAddress;

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
     * Get File name 
     * @return FileName File name
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set File name
     * @param FileName File name
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get Add configuration list 
     * @return AddItems Add configuration list
     */
    public InstanceConfigItem [] getAddItems() {
        return this.AddItems;
    }

    /**
     * Set Add configuration list
     * @param AddItems Add configuration list
     */
    public void setAddItems(InstanceConfigItem [] AddItems) {
        this.AddItems = AddItems;
    }

    /**
     * Get Update configuration list 
     * @return UpdateItems Update configuration list
     */
    public InstanceConfigItem [] getUpdateItems() {
        return this.UpdateItems;
    }

    /**
     * Set Update configuration list
     * @param UpdateItems Update configuration list
     */
    public void setUpdateItems(InstanceConfigItem [] UpdateItems) {
        this.UpdateItems = UpdateItems;
    }

    /**
     * Get Delete configuration list 
     * @return DelItems Delete configuration list
     */
    public InstanceConfigItem [] getDelItems() {
        return this.DelItems;
    }

    /**
     * Set Delete configuration list
     * @param DelItems Delete configuration list
     */
    public void setDelItems(InstanceConfigItem [] DelItems) {
        this.DelItems = DelItems;
    }

    /**
     * Get Remarks (within 50 words) 
     * @return Message Remarks (within 50 words)
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Remarks (within 50 words)
     * @param Message Remarks (within 50 words)
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get Hot update list 
     * @return HotUpdateItems Hot update list
     */
    public InstanceConfigItem [] getHotUpdateItems() {
        return this.HotUpdateItems;
    }

    /**
     * Set Hot update list
     * @param HotUpdateItems Hot update list
     */
    public void setHotUpdateItems(InstanceConfigItem [] HotUpdateItems) {
        this.HotUpdateItems = HotUpdateItems;
    }

    /**
     * Get Delete configuration list 
     * @return DeleteItems Delete configuration list
     */
    public InstanceConfigItem getDeleteItems() {
        return this.DeleteItems;
    }

    /**
     * Set Delete configuration list
     * @param DeleteItems Delete configuration list
     */
    public void setDeleteItems(InstanceConfigItem DeleteItems) {
        this.DeleteItems = DeleteItems;
    }

    /**
     * Get IP address 
     * @return IPAddress IP address
     */
    public String getIPAddress() {
        return this.IPAddress;
    }

    /**
     * Set IP address
     * @param IPAddress IP address
     */
    public void setIPAddress(String IPAddress) {
        this.IPAddress = IPAddress;
    }

    public ModifyInstanceKeyValConfigsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstanceKeyValConfigsRequest(ModifyInstanceKeyValConfigsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.AddItems != null) {
            this.AddItems = new InstanceConfigItem[source.AddItems.length];
            for (int i = 0; i < source.AddItems.length; i++) {
                this.AddItems[i] = new InstanceConfigItem(source.AddItems[i]);
            }
        }
        if (source.UpdateItems != null) {
            this.UpdateItems = new InstanceConfigItem[source.UpdateItems.length];
            for (int i = 0; i < source.UpdateItems.length; i++) {
                this.UpdateItems[i] = new InstanceConfigItem(source.UpdateItems[i]);
            }
        }
        if (source.DelItems != null) {
            this.DelItems = new InstanceConfigItem[source.DelItems.length];
            for (int i = 0; i < source.DelItems.length; i++) {
                this.DelItems[i] = new InstanceConfigItem(source.DelItems[i]);
            }
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.HotUpdateItems != null) {
            this.HotUpdateItems = new InstanceConfigItem[source.HotUpdateItems.length];
            for (int i = 0; i < source.HotUpdateItems.length; i++) {
                this.HotUpdateItems[i] = new InstanceConfigItem(source.HotUpdateItems[i]);
            }
        }
        if (source.DeleteItems != null) {
            this.DeleteItems = new InstanceConfigItem(source.DeleteItems);
        }
        if (source.IPAddress != null) {
            this.IPAddress = new String(source.IPAddress);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamArrayObj(map, prefix + "AddItems.", this.AddItems);
        this.setParamArrayObj(map, prefix + "UpdateItems.", this.UpdateItems);
        this.setParamArrayObj(map, prefix + "DelItems.", this.DelItems);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamArrayObj(map, prefix + "HotUpdateItems.", this.HotUpdateItems);
        this.setParamObj(map, prefix + "DeleteItems.", this.DeleteItems);
        this.setParamSimple(map, prefix + "IPAddress", this.IPAddress);

    }
}

