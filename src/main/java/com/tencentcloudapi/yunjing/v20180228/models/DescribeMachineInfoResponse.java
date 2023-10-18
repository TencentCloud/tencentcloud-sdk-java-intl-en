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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMachineInfoResponse extends AbstractModel {

    /**
    * Server IP.
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * Days under protection by CWP
    */
    @SerializedName("ProtectDays")
    @Expose
    private Long ProtectDays;

    /**
    * OS.
    */
    @SerializedName("MachineOs")
    @Expose
    private String MachineOs;

    /**
    * Server name.
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * Status.
<li>ONLINE: online</li>
<li>OFFLINE: offline</li>
    */
    @SerializedName("MachineStatus")
    @Expose
    private String MachineStatus;

    /**
    * Unique ID of CVM or BM instance.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Public IP of server.
    */
    @SerializedName("MachineWanIp")
    @Expose
    private String MachineWanIp;

    /**
    * CVM or BM instance `Uuid`.
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * CWP agent `Uuid`.
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * Whether CWP Pro is activated.
<li>true: yes</li>
<li>false: no</li>
    */
    @SerializedName("IsProVersion")
    @Expose
    private Boolean IsProVersion;

    /**
    * CWP Pro activation time.
    */
    @SerializedName("ProVersionOpenDate")
    @Expose
    private String ProVersionOpenDate;

    /**
    * Server type.
<li>CVM: CVM</li>
<li>BM: BM</li>
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * Server region, such as ap-guangzhou or ap-shanghai
    */
    @SerializedName("MachineRegion")
    @Expose
    private String MachineRegion;

    /**
    * Server status.
<li>POSTPAY: post-paid, i.e., pay-as-you-go </li>
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * Number of trojans left for free scan.
    */
    @SerializedName("FreeMalwaresLeft")
    @Expose
    private Long FreeMalwaresLeft;

    /**
    * Number of vulnerability left for free scan.
    */
    @SerializedName("FreeVulsLeft")
    @Expose
    private Long FreeVulsLeft;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Server IP. 
     * @return MachineIp Server IP.
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * Set Server IP.
     * @param MachineIp Server IP.
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * Get Days under protection by CWP 
     * @return ProtectDays Days under protection by CWP
     */
    public Long getProtectDays() {
        return this.ProtectDays;
    }

    /**
     * Set Days under protection by CWP
     * @param ProtectDays Days under protection by CWP
     */
    public void setProtectDays(Long ProtectDays) {
        this.ProtectDays = ProtectDays;
    }

    /**
     * Get OS. 
     * @return MachineOs OS.
     */
    public String getMachineOs() {
        return this.MachineOs;
    }

    /**
     * Set OS.
     * @param MachineOs OS.
     */
    public void setMachineOs(String MachineOs) {
        this.MachineOs = MachineOs;
    }

    /**
     * Get Server name. 
     * @return MachineName Server name.
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set Server name.
     * @param MachineName Server name.
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get Status.
<li>ONLINE: online</li>
<li>OFFLINE: offline</li> 
     * @return MachineStatus Status.
<li>ONLINE: online</li>
<li>OFFLINE: offline</li>
     */
    public String getMachineStatus() {
        return this.MachineStatus;
    }

    /**
     * Set Status.
<li>ONLINE: online</li>
<li>OFFLINE: offline</li>
     * @param MachineStatus Status.
<li>ONLINE: online</li>
<li>OFFLINE: offline</li>
     */
    public void setMachineStatus(String MachineStatus) {
        this.MachineStatus = MachineStatus;
    }

    /**
     * Get Unique ID of CVM or BM instance. 
     * @return InstanceId Unique ID of CVM or BM instance.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Unique ID of CVM or BM instance.
     * @param InstanceId Unique ID of CVM or BM instance.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Public IP of server. 
     * @return MachineWanIp Public IP of server.
     */
    public String getMachineWanIp() {
        return this.MachineWanIp;
    }

    /**
     * Set Public IP of server.
     * @param MachineWanIp Public IP of server.
     */
    public void setMachineWanIp(String MachineWanIp) {
        this.MachineWanIp = MachineWanIp;
    }

    /**
     * Get CVM or BM instance `Uuid`. 
     * @return Quuid CVM or BM instance `Uuid`.
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set CVM or BM instance `Uuid`.
     * @param Quuid CVM or BM instance `Uuid`.
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get CWP agent `Uuid`. 
     * @return Uuid CWP agent `Uuid`.
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set CWP agent `Uuid`.
     * @param Uuid CWP agent `Uuid`.
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get Whether CWP Pro is activated.
<li>true: yes</li>
<li>false: no</li> 
     * @return IsProVersion Whether CWP Pro is activated.
<li>true: yes</li>
<li>false: no</li>
     */
    public Boolean getIsProVersion() {
        return this.IsProVersion;
    }

    /**
     * Set Whether CWP Pro is activated.
<li>true: yes</li>
<li>false: no</li>
     * @param IsProVersion Whether CWP Pro is activated.
<li>true: yes</li>
<li>false: no</li>
     */
    public void setIsProVersion(Boolean IsProVersion) {
        this.IsProVersion = IsProVersion;
    }

    /**
     * Get CWP Pro activation time. 
     * @return ProVersionOpenDate CWP Pro activation time.
     */
    public String getProVersionOpenDate() {
        return this.ProVersionOpenDate;
    }

    /**
     * Set CWP Pro activation time.
     * @param ProVersionOpenDate CWP Pro activation time.
     */
    public void setProVersionOpenDate(String ProVersionOpenDate) {
        this.ProVersionOpenDate = ProVersionOpenDate;
    }

    /**
     * Get Server type.
<li>CVM: CVM</li>
<li>BM: BM</li> 
     * @return MachineType Server type.
<li>CVM: CVM</li>
<li>BM: BM</li>
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set Server type.
<li>CVM: CVM</li>
<li>BM: BM</li>
     * @param MachineType Server type.
<li>CVM: CVM</li>
<li>BM: BM</li>
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get Server region, such as ap-guangzhou or ap-shanghai 
     * @return MachineRegion Server region, such as ap-guangzhou or ap-shanghai
     */
    public String getMachineRegion() {
        return this.MachineRegion;
    }

    /**
     * Set Server region, such as ap-guangzhou or ap-shanghai
     * @param MachineRegion Server region, such as ap-guangzhou or ap-shanghai
     */
    public void setMachineRegion(String MachineRegion) {
        this.MachineRegion = MachineRegion;
    }

    /**
     * Get Server status.
<li>POSTPAY: post-paid, i.e., pay-as-you-go </li> 
     * @return PayMode Server status.
<li>POSTPAY: post-paid, i.e., pay-as-you-go </li>
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Server status.
<li>POSTPAY: post-paid, i.e., pay-as-you-go </li>
     * @param PayMode Server status.
<li>POSTPAY: post-paid, i.e., pay-as-you-go </li>
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Number of trojans left for free scan. 
     * @return FreeMalwaresLeft Number of trojans left for free scan.
     */
    public Long getFreeMalwaresLeft() {
        return this.FreeMalwaresLeft;
    }

    /**
     * Set Number of trojans left for free scan.
     * @param FreeMalwaresLeft Number of trojans left for free scan.
     */
    public void setFreeMalwaresLeft(Long FreeMalwaresLeft) {
        this.FreeMalwaresLeft = FreeMalwaresLeft;
    }

    /**
     * Get Number of vulnerability left for free scan. 
     * @return FreeVulsLeft Number of vulnerability left for free scan.
     */
    public Long getFreeVulsLeft() {
        return this.FreeVulsLeft;
    }

    /**
     * Set Number of vulnerability left for free scan.
     * @param FreeVulsLeft Number of vulnerability left for free scan.
     */
    public void setFreeVulsLeft(Long FreeVulsLeft) {
        this.FreeVulsLeft = FreeVulsLeft;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeMachineInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMachineInfoResponse(DescribeMachineInfoResponse source) {
        if (source.MachineIp != null) {
            this.MachineIp = new String(source.MachineIp);
        }
        if (source.ProtectDays != null) {
            this.ProtectDays = new Long(source.ProtectDays);
        }
        if (source.MachineOs != null) {
            this.MachineOs = new String(source.MachineOs);
        }
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
        }
        if (source.MachineStatus != null) {
            this.MachineStatus = new String(source.MachineStatus);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.MachineWanIp != null) {
            this.MachineWanIp = new String(source.MachineWanIp);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.IsProVersion != null) {
            this.IsProVersion = new Boolean(source.IsProVersion);
        }
        if (source.ProVersionOpenDate != null) {
            this.ProVersionOpenDate = new String(source.ProVersionOpenDate);
        }
        if (source.MachineType != null) {
            this.MachineType = new String(source.MachineType);
        }
        if (source.MachineRegion != null) {
            this.MachineRegion = new String(source.MachineRegion);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.FreeMalwaresLeft != null) {
            this.FreeMalwaresLeft = new Long(source.FreeMalwaresLeft);
        }
        if (source.FreeVulsLeft != null) {
            this.FreeVulsLeft = new Long(source.FreeVulsLeft);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "ProtectDays", this.ProtectDays);
        this.setParamSimple(map, prefix + "MachineOs", this.MachineOs);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "MachineStatus", this.MachineStatus);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "MachineWanIp", this.MachineWanIp);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "IsProVersion", this.IsProVersion);
        this.setParamSimple(map, prefix + "ProVersionOpenDate", this.ProVersionOpenDate);
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);
        this.setParamSimple(map, prefix + "MachineRegion", this.MachineRegion);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "FreeMalwaresLeft", this.FreeMalwaresLeft);
        this.setParamSimple(map, prefix + "FreeVulsLeft", this.FreeVulsLeft);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

