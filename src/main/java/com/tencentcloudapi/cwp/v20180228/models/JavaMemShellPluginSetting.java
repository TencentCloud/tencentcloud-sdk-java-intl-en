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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class JavaMemShellPluginSetting extends AbstractModel {

    /**
    * Container QUUID
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * Server name
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * Server IP address
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * Javashell Plugin Switch. 0: Off; 1: On
    */
    @SerializedName("JavaShellStatus")
    @Expose
    private Long JavaShellStatus;

    /**
    * Plugin Exception Status. 0: Normal; 1: Abnormal
    */
    @SerializedName("Exception")
    @Expose
    private Long Exception;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Modification time
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * Server UUID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * Host Additional Information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

    /**
     * Get Container QUUID 
     * @return Quuid Container QUUID
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set Container QUUID
     * @param Quuid Container QUUID
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get Server name 
     * @return Alias Server name
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set Server name
     * @param Alias Server name
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get Server IP address 
     * @return HostIp Server IP address
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set Server IP address
     * @param HostIp Server IP address
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
    }

    /**
     * Get Javashell Plugin Switch. 0: Off; 1: On 
     * @return JavaShellStatus Javashell Plugin Switch. 0: Off; 1: On
     */
    public Long getJavaShellStatus() {
        return this.JavaShellStatus;
    }

    /**
     * Set Javashell Plugin Switch. 0: Off; 1: On
     * @param JavaShellStatus Javashell Plugin Switch. 0: Off; 1: On
     */
    public void setJavaShellStatus(Long JavaShellStatus) {
        this.JavaShellStatus = JavaShellStatus;
    }

    /**
     * Get Plugin Exception Status. 0: Normal; 1: Abnormal 
     * @return Exception Plugin Exception Status. 0: Normal; 1: Abnormal
     */
    public Long getException() {
        return this.Exception;
    }

    /**
     * Set Plugin Exception Status. 0: Normal; 1: Abnormal
     * @param Exception Plugin Exception Status. 0: Normal; 1: Abnormal
     */
    public void setException(Long Exception) {
        this.Exception = Exception;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Modification time 
     * @return ModifyTime Modification time
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Modification time
     * @param ModifyTime Modification time
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get Server UUID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Uuid Server UUID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set Server UUID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Uuid Server UUID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
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

    public JavaMemShellPluginSetting() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public JavaMemShellPluginSetting(JavaMemShellPluginSetting source) {
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
        }
        if (source.JavaShellStatus != null) {
            this.JavaShellStatus = new Long(source.JavaShellStatus);
        }
        if (source.Exception != null) {
            this.Exception = new Long(source.Exception);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.MachineExtraInfo != null) {
            this.MachineExtraInfo = new MachineExtraInfo(source.MachineExtraInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamSimple(map, prefix + "JavaShellStatus", this.JavaShellStatus);
        this.setParamSimple(map, prefix + "Exception", this.Exception);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);

    }
}

