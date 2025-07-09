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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PreExecuteFileSettings extends AbstractModel {

    /**
    * COS path to script, which has been disused
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * Execution script parameter
    */
    @SerializedName("Args")
    @Expose
    private String [] Args;

    /**
    * COS bucket name, which has been disused
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * COS region name, which has been disused
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * COS domain data, which has been disused
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Execution sequence
    */
    @SerializedName("RunOrder")
    @Expose
    private Long RunOrder;

    /**
    * `resourceAfter` or `clusterAfter`
    */
    @SerializedName("WhenRun")
    @Expose
    private String WhenRun;

    /**
    * Script name, which has been disused
    */
    @SerializedName("CosFileName")
    @Expose
    private String CosFileName;

    /**
    * COS address of script
    */
    @SerializedName("CosFileURI")
    @Expose
    private String CosFileURI;

    /**
    * COS `SecretId`
    */
    @SerializedName("CosSecretId")
    @Expose
    private String CosSecretId;

    /**
    * COS `SecretKey`
    */
    @SerializedName("CosSecretKey")
    @Expose
    private String CosSecretKey;

    /**
    * COS `appid`, which has been disused
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * Remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get COS path to script, which has been disused 
     * @return Path COS path to script, which has been disused
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set COS path to script, which has been disused
     * @param Path COS path to script, which has been disused
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get Execution script parameter 
     * @return Args Execution script parameter
     */
    public String [] getArgs() {
        return this.Args;
    }

    /**
     * Set Execution script parameter
     * @param Args Execution script parameter
     */
    public void setArgs(String [] Args) {
        this.Args = Args;
    }

    /**
     * Get COS bucket name, which has been disused 
     * @return Bucket COS bucket name, which has been disused
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set COS bucket name, which has been disused
     * @param Bucket COS bucket name, which has been disused
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get COS region name, which has been disused 
     * @return Region COS region name, which has been disused
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set COS region name, which has been disused
     * @param Region COS region name, which has been disused
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get COS domain data, which has been disused 
     * @return Domain COS domain data, which has been disused
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set COS domain data, which has been disused
     * @param Domain COS domain data, which has been disused
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Execution sequence 
     * @return RunOrder Execution sequence
     */
    public Long getRunOrder() {
        return this.RunOrder;
    }

    /**
     * Set Execution sequence
     * @param RunOrder Execution sequence
     */
    public void setRunOrder(Long RunOrder) {
        this.RunOrder = RunOrder;
    }

    /**
     * Get `resourceAfter` or `clusterAfter` 
     * @return WhenRun `resourceAfter` or `clusterAfter`
     */
    public String getWhenRun() {
        return this.WhenRun;
    }

    /**
     * Set `resourceAfter` or `clusterAfter`
     * @param WhenRun `resourceAfter` or `clusterAfter`
     */
    public void setWhenRun(String WhenRun) {
        this.WhenRun = WhenRun;
    }

    /**
     * Get Script name, which has been disused 
     * @return CosFileName Script name, which has been disused
     */
    public String getCosFileName() {
        return this.CosFileName;
    }

    /**
     * Set Script name, which has been disused
     * @param CosFileName Script name, which has been disused
     */
    public void setCosFileName(String CosFileName) {
        this.CosFileName = CosFileName;
    }

    /**
     * Get COS address of script 
     * @return CosFileURI COS address of script
     */
    public String getCosFileURI() {
        return this.CosFileURI;
    }

    /**
     * Set COS address of script
     * @param CosFileURI COS address of script
     */
    public void setCosFileURI(String CosFileURI) {
        this.CosFileURI = CosFileURI;
    }

    /**
     * Get COS `SecretId` 
     * @return CosSecretId COS `SecretId`
     */
    public String getCosSecretId() {
        return this.CosSecretId;
    }

    /**
     * Set COS `SecretId`
     * @param CosSecretId COS `SecretId`
     */
    public void setCosSecretId(String CosSecretId) {
        this.CosSecretId = CosSecretId;
    }

    /**
     * Get COS `SecretKey` 
     * @return CosSecretKey COS `SecretKey`
     */
    public String getCosSecretKey() {
        return this.CosSecretKey;
    }

    /**
     * Set COS `SecretKey`
     * @param CosSecretKey COS `SecretKey`
     */
    public void setCosSecretKey(String CosSecretKey) {
        this.CosSecretKey = CosSecretKey;
    }

    /**
     * Get COS `appid`, which has been disused 
     * @return AppId COS `appid`, which has been disused
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set COS `appid`, which has been disused
     * @param AppId COS `appid`, which has been disused
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Remarks 
     * @return Remark Remarks
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks
     * @param Remark Remarks
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public PreExecuteFileSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PreExecuteFileSettings(PreExecuteFileSettings source) {
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Args != null) {
            this.Args = new String[source.Args.length];
            for (int i = 0; i < source.Args.length; i++) {
                this.Args[i] = new String(source.Args[i]);
            }
        }
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.RunOrder != null) {
            this.RunOrder = new Long(source.RunOrder);
        }
        if (source.WhenRun != null) {
            this.WhenRun = new String(source.WhenRun);
        }
        if (source.CosFileName != null) {
            this.CosFileName = new String(source.CosFileName);
        }
        if (source.CosFileURI != null) {
            this.CosFileURI = new String(source.CosFileURI);
        }
        if (source.CosSecretId != null) {
            this.CosSecretId = new String(source.CosSecretId);
        }
        if (source.CosSecretKey != null) {
            this.CosSecretKey = new String(source.CosSecretKey);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamArraySimple(map, prefix + "Args.", this.Args);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "RunOrder", this.RunOrder);
        this.setParamSimple(map, prefix + "WhenRun", this.WhenRun);
        this.setParamSimple(map, prefix + "CosFileName", this.CosFileName);
        this.setParamSimple(map, prefix + "CosFileURI", this.CosFileURI);
        this.setParamSimple(map, prefix + "CosSecretId", this.CosSecretId);
        this.setParamSimple(map, prefix + "CosSecretKey", this.CosSecretKey);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

