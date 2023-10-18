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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReverseShellWhiteListInfo extends AbstractModel {

    /**
    * Target IP
    */
    @SerializedName("DstIp")
    @Expose
    private String DstIp;

    /**
    * Target port
    */
    @SerializedName("DstPort")
    @Expose
    private String DstPort;

    /**
    * Target process
    */
    @SerializedName("ProcessName")
    @Expose
    private String ProcessName;

    /**
    * Array of image IDs. An empty array indicates all.
    */
    @SerializedName("ImageIds")
    @Expose
    private String [] ImageIds;

    /**
    * Allowed item ID, which is empty if the item is newly created.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
     * Get Target IP 
     * @return DstIp Target IP
     */
    public String getDstIp() {
        return this.DstIp;
    }

    /**
     * Set Target IP
     * @param DstIp Target IP
     */
    public void setDstIp(String DstIp) {
        this.DstIp = DstIp;
    }

    /**
     * Get Target port 
     * @return DstPort Target port
     */
    public String getDstPort() {
        return this.DstPort;
    }

    /**
     * Set Target port
     * @param DstPort Target port
     */
    public void setDstPort(String DstPort) {
        this.DstPort = DstPort;
    }

    /**
     * Get Target process 
     * @return ProcessName Target process
     */
    public String getProcessName() {
        return this.ProcessName;
    }

    /**
     * Set Target process
     * @param ProcessName Target process
     */
    public void setProcessName(String ProcessName) {
        this.ProcessName = ProcessName;
    }

    /**
     * Get Array of image IDs. An empty array indicates all. 
     * @return ImageIds Array of image IDs. An empty array indicates all.
     */
    public String [] getImageIds() {
        return this.ImageIds;
    }

    /**
     * Set Array of image IDs. An empty array indicates all.
     * @param ImageIds Array of image IDs. An empty array indicates all.
     */
    public void setImageIds(String [] ImageIds) {
        this.ImageIds = ImageIds;
    }

    /**
     * Get Allowed item ID, which is empty if the item is newly created. 
     * @return Id Allowed item ID, which is empty if the item is newly created.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Allowed item ID, which is empty if the item is newly created.
     * @param Id Allowed item ID, which is empty if the item is newly created.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    public ReverseShellWhiteListInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReverseShellWhiteListInfo(ReverseShellWhiteListInfo source) {
        if (source.DstIp != null) {
            this.DstIp = new String(source.DstIp);
        }
        if (source.DstPort != null) {
            this.DstPort = new String(source.DstPort);
        }
        if (source.ProcessName != null) {
            this.ProcessName = new String(source.ProcessName);
        }
        if (source.ImageIds != null) {
            this.ImageIds = new String[source.ImageIds.length];
            for (int i = 0; i < source.ImageIds.length; i++) {
                this.ImageIds[i] = new String(source.ImageIds[i]);
            }
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DstIp", this.DstIp);
        this.setParamSimple(map, prefix + "DstPort", this.DstPort);
        this.setParamSimple(map, prefix + "ProcessName", this.ProcessName);
        this.setParamArraySimple(map, prefix + "ImageIds.", this.ImageIds);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

