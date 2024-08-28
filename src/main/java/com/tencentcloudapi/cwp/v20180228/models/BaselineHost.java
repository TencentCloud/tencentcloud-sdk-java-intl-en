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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaselineHost extends AbstractModel {

    /**
    * Host ID
    */
    @SerializedName("HostId")
    @Expose
    private String HostId;

    /**
    * Host name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * Host tag
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HostTag")
    @Expose
    private String HostTag;

    /**
    * Private IP address
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * Public IP address
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WanIp")
    @Expose
    private String WanIp;

    /**
    * Host Additional Information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

    /**
     * Get Host ID 
     * @return HostId Host ID
     */
    public String getHostId() {
        return this.HostId;
    }

    /**
     * Set Host ID
     * @param HostId Host ID
     */
    public void setHostId(String HostId) {
        this.HostId = HostId;
    }

    /**
     * Get Host name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HostName Host name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set Host name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HostName Host name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get Host tag
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HostTag Host tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHostTag() {
        return this.HostTag;
    }

    /**
     * Set Host tag
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HostTag Host tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHostTag(String HostTag) {
        this.HostTag = HostTag;
    }

    /**
     * Get Private IP address
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HostIp Private IP address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set Private IP address
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HostIp Private IP address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
    }

    /**
     * Get Public IP address
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WanIp Public IP address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getWanIp() {
        return this.WanIp;
    }

    /**
     * Set Public IP address
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WanIp Public IP address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWanIp(String WanIp) {
        this.WanIp = WanIp;
    }

    /**
     * Get Host Additional Information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MachineExtraInfo Host Additional Information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MachineExtraInfo getMachineExtraInfo() {
        return this.MachineExtraInfo;
    }

    /**
     * Set Host Additional Information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MachineExtraInfo Host Additional Information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMachineExtraInfo(MachineExtraInfo MachineExtraInfo) {
        this.MachineExtraInfo = MachineExtraInfo;
    }

    public BaselineHost() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineHost(BaselineHost source) {
        if (source.HostId != null) {
            this.HostId = new String(source.HostId);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.HostTag != null) {
            this.HostTag = new String(source.HostTag);
        }
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
        }
        if (source.WanIp != null) {
            this.WanIp = new String(source.WanIp);
        }
        if (source.MachineExtraInfo != null) {
            this.MachineExtraInfo = new MachineExtraInfo(source.MachineExtraInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HostId", this.HostId);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "HostTag", this.HostTag);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamSimple(map, prefix + "WanIp", this.WanIp);
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);

    }
}

