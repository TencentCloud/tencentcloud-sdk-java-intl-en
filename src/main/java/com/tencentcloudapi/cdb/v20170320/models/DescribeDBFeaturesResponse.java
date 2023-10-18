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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBFeaturesResponse extends AbstractModel {

    /**
    * Whether database audit is supported
    */
    @SerializedName("IsSupportAudit")
    @Expose
    private Boolean IsSupportAudit;

    /**
    * Whether enabling audit requires a kernel version upgrade
    */
    @SerializedName("AuditNeedUpgrade")
    @Expose
    private Boolean AuditNeedUpgrade;

    /**
    * Whether database encryption is supported
    */
    @SerializedName("IsSupportEncryption")
    @Expose
    private Boolean IsSupportEncryption;

    /**
    * Whether enabling encryption requires a kernel version upgrade
    */
    @SerializedName("EncryptionNeedUpgrade")
    @Expose
    private Boolean EncryptionNeedUpgrade;

    /**
    * Whether the instance is a remote read-only instance
    */
    @SerializedName("IsRemoteRo")
    @Expose
    private Boolean IsRemoteRo;

    /**
    * Region of the source instance
    */
    @SerializedName("MasterRegion")
    @Expose
    private String MasterRegion;

    /**
    * Whether minor version upgrade is supported
    */
    @SerializedName("IsSupportUpdateSubVersion")
    @Expose
    private Boolean IsSupportUpdateSubVersion;

    /**
    * The current kernel version
    */
    @SerializedName("CurrentSubVersion")
    @Expose
    private String CurrentSubVersion;

    /**
    * Available kernel version for upgrade
    */
    @SerializedName("TargetSubVersion")
    @Expose
    private String TargetSubVersion;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Whether database audit is supported 
     * @return IsSupportAudit Whether database audit is supported
     */
    public Boolean getIsSupportAudit() {
        return this.IsSupportAudit;
    }

    /**
     * Set Whether database audit is supported
     * @param IsSupportAudit Whether database audit is supported
     */
    public void setIsSupportAudit(Boolean IsSupportAudit) {
        this.IsSupportAudit = IsSupportAudit;
    }

    /**
     * Get Whether enabling audit requires a kernel version upgrade 
     * @return AuditNeedUpgrade Whether enabling audit requires a kernel version upgrade
     */
    public Boolean getAuditNeedUpgrade() {
        return this.AuditNeedUpgrade;
    }

    /**
     * Set Whether enabling audit requires a kernel version upgrade
     * @param AuditNeedUpgrade Whether enabling audit requires a kernel version upgrade
     */
    public void setAuditNeedUpgrade(Boolean AuditNeedUpgrade) {
        this.AuditNeedUpgrade = AuditNeedUpgrade;
    }

    /**
     * Get Whether database encryption is supported 
     * @return IsSupportEncryption Whether database encryption is supported
     */
    public Boolean getIsSupportEncryption() {
        return this.IsSupportEncryption;
    }

    /**
     * Set Whether database encryption is supported
     * @param IsSupportEncryption Whether database encryption is supported
     */
    public void setIsSupportEncryption(Boolean IsSupportEncryption) {
        this.IsSupportEncryption = IsSupportEncryption;
    }

    /**
     * Get Whether enabling encryption requires a kernel version upgrade 
     * @return EncryptionNeedUpgrade Whether enabling encryption requires a kernel version upgrade
     */
    public Boolean getEncryptionNeedUpgrade() {
        return this.EncryptionNeedUpgrade;
    }

    /**
     * Set Whether enabling encryption requires a kernel version upgrade
     * @param EncryptionNeedUpgrade Whether enabling encryption requires a kernel version upgrade
     */
    public void setEncryptionNeedUpgrade(Boolean EncryptionNeedUpgrade) {
        this.EncryptionNeedUpgrade = EncryptionNeedUpgrade;
    }

    /**
     * Get Whether the instance is a remote read-only instance 
     * @return IsRemoteRo Whether the instance is a remote read-only instance
     */
    public Boolean getIsRemoteRo() {
        return this.IsRemoteRo;
    }

    /**
     * Set Whether the instance is a remote read-only instance
     * @param IsRemoteRo Whether the instance is a remote read-only instance
     */
    public void setIsRemoteRo(Boolean IsRemoteRo) {
        this.IsRemoteRo = IsRemoteRo;
    }

    /**
     * Get Region of the source instance 
     * @return MasterRegion Region of the source instance
     */
    public String getMasterRegion() {
        return this.MasterRegion;
    }

    /**
     * Set Region of the source instance
     * @param MasterRegion Region of the source instance
     */
    public void setMasterRegion(String MasterRegion) {
        this.MasterRegion = MasterRegion;
    }

    /**
     * Get Whether minor version upgrade is supported 
     * @return IsSupportUpdateSubVersion Whether minor version upgrade is supported
     */
    public Boolean getIsSupportUpdateSubVersion() {
        return this.IsSupportUpdateSubVersion;
    }

    /**
     * Set Whether minor version upgrade is supported
     * @param IsSupportUpdateSubVersion Whether minor version upgrade is supported
     */
    public void setIsSupportUpdateSubVersion(Boolean IsSupportUpdateSubVersion) {
        this.IsSupportUpdateSubVersion = IsSupportUpdateSubVersion;
    }

    /**
     * Get The current kernel version 
     * @return CurrentSubVersion The current kernel version
     */
    public String getCurrentSubVersion() {
        return this.CurrentSubVersion;
    }

    /**
     * Set The current kernel version
     * @param CurrentSubVersion The current kernel version
     */
    public void setCurrentSubVersion(String CurrentSubVersion) {
        this.CurrentSubVersion = CurrentSubVersion;
    }

    /**
     * Get Available kernel version for upgrade 
     * @return TargetSubVersion Available kernel version for upgrade
     */
    public String getTargetSubVersion() {
        return this.TargetSubVersion;
    }

    /**
     * Set Available kernel version for upgrade
     * @param TargetSubVersion Available kernel version for upgrade
     */
    public void setTargetSubVersion(String TargetSubVersion) {
        this.TargetSubVersion = TargetSubVersion;
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

    public DescribeDBFeaturesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBFeaturesResponse(DescribeDBFeaturesResponse source) {
        if (source.IsSupportAudit != null) {
            this.IsSupportAudit = new Boolean(source.IsSupportAudit);
        }
        if (source.AuditNeedUpgrade != null) {
            this.AuditNeedUpgrade = new Boolean(source.AuditNeedUpgrade);
        }
        if (source.IsSupportEncryption != null) {
            this.IsSupportEncryption = new Boolean(source.IsSupportEncryption);
        }
        if (source.EncryptionNeedUpgrade != null) {
            this.EncryptionNeedUpgrade = new Boolean(source.EncryptionNeedUpgrade);
        }
        if (source.IsRemoteRo != null) {
            this.IsRemoteRo = new Boolean(source.IsRemoteRo);
        }
        if (source.MasterRegion != null) {
            this.MasterRegion = new String(source.MasterRegion);
        }
        if (source.IsSupportUpdateSubVersion != null) {
            this.IsSupportUpdateSubVersion = new Boolean(source.IsSupportUpdateSubVersion);
        }
        if (source.CurrentSubVersion != null) {
            this.CurrentSubVersion = new String(source.CurrentSubVersion);
        }
        if (source.TargetSubVersion != null) {
            this.TargetSubVersion = new String(source.TargetSubVersion);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsSupportAudit", this.IsSupportAudit);
        this.setParamSimple(map, prefix + "AuditNeedUpgrade", this.AuditNeedUpgrade);
        this.setParamSimple(map, prefix + "IsSupportEncryption", this.IsSupportEncryption);
        this.setParamSimple(map, prefix + "EncryptionNeedUpgrade", this.EncryptionNeedUpgrade);
        this.setParamSimple(map, prefix + "IsRemoteRo", this.IsRemoteRo);
        this.setParamSimple(map, prefix + "MasterRegion", this.MasterRegion);
        this.setParamSimple(map, prefix + "IsSupportUpdateSubVersion", this.IsSupportUpdateSubVersion);
        this.setParamSimple(map, prefix + "CurrentSubVersion", this.CurrentSubVersion);
        this.setParamSimple(map, prefix + "TargetSubVersion", this.TargetSubVersion);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

