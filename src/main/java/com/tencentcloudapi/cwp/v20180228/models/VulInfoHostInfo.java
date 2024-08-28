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

public class VulInfoHostInfo extends AbstractModel {

    /**
    * Host name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * Host IP
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * Host tag
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * Host QUUID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 0 - the vulnerability cannot be fixed automatically; 1 - the vulnerability can be fixed automatically; 2 - the client has been offline; 3 - the host is not the ultimate edition and can only be fixed manually; 4 - the model does not allow automatic fix; 5 - fixing; 6 - fixed; 7 - under detection; 9 - fix failed; 10 - ignored; 11 - the vulnerability is supported only on Linux, not on Windows; 12 - the vulnerability is supported only on Windows, not on Linux.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsSupportAutoFix")
    @Expose
    private Long IsSupportAutoFix;

    /**
    * Host UUID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * Host InstanceId
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

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
     * Get Host IP
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HostIp Host IP
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set Host IP
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HostIp Host IP
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
    }

    /**
     * Get Host tag
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Tags Host tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set Host tag
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Tags Host tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Host QUUID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Quuid Host QUUID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set Host QUUID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Quuid Host QUUID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get 0 - the vulnerability cannot be fixed automatically; 1 - the vulnerability can be fixed automatically; 2 - the client has been offline; 3 - the host is not the ultimate edition and can only be fixed manually; 4 - the model does not allow automatic fix; 5 - fixing; 6 - fixed; 7 - under detection; 9 - fix failed; 10 - ignored; 11 - the vulnerability is supported only on Linux, not on Windows; 12 - the vulnerability is supported only on Windows, not on Linux.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsSupportAutoFix 0 - the vulnerability cannot be fixed automatically; 1 - the vulnerability can be fixed automatically; 2 - the client has been offline; 3 - the host is not the ultimate edition and can only be fixed manually; 4 - the model does not allow automatic fix; 5 - fixing; 6 - fixed; 7 - under detection; 9 - fix failed; 10 - ignored; 11 - the vulnerability is supported only on Linux, not on Windows; 12 - the vulnerability is supported only on Windows, not on Linux.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsSupportAutoFix() {
        return this.IsSupportAutoFix;
    }

    /**
     * Set 0 - the vulnerability cannot be fixed automatically; 1 - the vulnerability can be fixed automatically; 2 - the client has been offline; 3 - the host is not the ultimate edition and can only be fixed manually; 4 - the model does not allow automatic fix; 5 - fixing; 6 - fixed; 7 - under detection; 9 - fix failed; 10 - ignored; 11 - the vulnerability is supported only on Linux, not on Windows; 12 - the vulnerability is supported only on Windows, not on Linux.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsSupportAutoFix 0 - the vulnerability cannot be fixed automatically; 1 - the vulnerability can be fixed automatically; 2 - the client has been offline; 3 - the host is not the ultimate edition and can only be fixed manually; 4 - the model does not allow automatic fix; 5 - fixing; 6 - fixed; 7 - under detection; 9 - fix failed; 10 - ignored; 11 - the vulnerability is supported only on Linux, not on Windows; 12 - the vulnerability is supported only on Windows, not on Linux.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsSupportAutoFix(Long IsSupportAutoFix) {
        this.IsSupportAutoFix = IsSupportAutoFix;
    }

    /**
     * Get Host UUID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Uuid Host UUID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set Host UUID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Uuid Host UUID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get Host InstanceId
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceId Host InstanceId
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Host InstanceId
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceId Host InstanceId
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public VulInfoHostInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulInfoHostInfo(VulInfoHostInfo source) {
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.IsSupportAutoFix != null) {
            this.IsSupportAutoFix = new Long(source.IsSupportAutoFix);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "IsSupportAutoFix", this.IsSupportAutoFix);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

