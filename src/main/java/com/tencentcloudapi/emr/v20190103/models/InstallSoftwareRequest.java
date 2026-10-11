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

public class InstallSoftwareRequest extends AbstractModel {

    /**
    * <p>Cluster ID.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Component version, for example, presto-0.161. You can view the components that can be installed on the current cluster via InstallSoftWareInfo.</p>
    */
    @SerializedName("SoftInfo")
    @Expose
    private String [] SoftInfo;

    /**
    * <p>If you use a monthly subscription cluster and need to purchase a CDB, determine whether to enable auto-renewal for the CDB. Default value: AUTO_RENEW. If auto-renewal is disabled for the newly-added CDB, fill in NOT_AUTO_RENEW.</p>
    */
    @SerializedName("CdbAutoRenew")
    @Expose
    private String CdbAutoRenew;

    /**
    * <p>Hive shared metadata database type. Valid values:</p><li>EMR_NEW_META: created by the cluster by default</li><li>EMR_EXIT_METE: EMR-MetaDB specified by the cluster</li><li>USER_CUSTOM_META: custom MetaDB used by the cluster</li>
    */
    @SerializedName("MetaType")
    @Expose
    private String MetaType;

    /**
    * <p>EMR-MetaDB instance.</p>
    */
    @SerializedName("UnifyMetaInstanceId")
    @Expose
    private String UnifyMetaInstanceId;

    /**
    * <p>Custom MetaDB information.</p>
    */
    @SerializedName("MetaDBInfo")
    @Expose
    private CustomMetaInfo MetaDBInfo;

    /**
    * <p>Shared component information.</p>
    */
    @SerializedName("ExternalService")
    @Expose
    private ExternalService [] ExternalService;

    /**
    * <p>Tag information.</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>Pod specification information of the role.</p>
    */
    @SerializedName("CloudResources")
    @Expose
    private CloudResource [] CloudResources;

    /**
    * <p>Custom deployment information.</p>
    */
    @SerializedName("ServiceDeployInfoList")
    @Expose
    private ServiceDeployInfo [] ServiceDeployInfoList;

    /**
    * <p>Database version.</p>
    */
    @SerializedName("DefaultMetaVersion")
    @Expose
    private String DefaultMetaVersion;

    /**
    * <p>Whether to enable audit.</p>
    */
    @SerializedName("NeedCdbAudit")
    @Expose
    private Long NeedCdbAudit;

    /**
    * <p>Additional container configuration.</p>
    */
    @SerializedName("ContainerExtraConf")
    @Expose
    private ContainerExtraConf ContainerExtraConf;

    /**
    * <p>Whether to forcibly check the validity of custom components. Currently, it is available only for the Terraform side.</p>
    */
    @SerializedName("CheckServiceDeployInfo")
    @Expose
    private Boolean CheckServiceDeployInfo;

    /**
    * <p>Custom MetaDB information.</p>
    */
    @SerializedName("MetaDBGroupInfo")
    @Expose
    private CustomMetaDBInfo [] MetaDBGroupInfo;

    /**
     * Get <p>Cluster ID.</p> 
     * @return InstanceId <p>Cluster ID.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Cluster ID.</p>
     * @param InstanceId <p>Cluster ID.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Component version, for example, presto-0.161. You can view the components that can be installed on the current cluster via InstallSoftWareInfo.</p> 
     * @return SoftInfo <p>Component version, for example, presto-0.161. You can view the components that can be installed on the current cluster via InstallSoftWareInfo.</p>
     */
    public String [] getSoftInfo() {
        return this.SoftInfo;
    }

    /**
     * Set <p>Component version, for example, presto-0.161. You can view the components that can be installed on the current cluster via InstallSoftWareInfo.</p>
     * @param SoftInfo <p>Component version, for example, presto-0.161. You can view the components that can be installed on the current cluster via InstallSoftWareInfo.</p>
     */
    public void setSoftInfo(String [] SoftInfo) {
        this.SoftInfo = SoftInfo;
    }

    /**
     * Get <p>If you use a monthly subscription cluster and need to purchase a CDB, determine whether to enable auto-renewal for the CDB. Default value: AUTO_RENEW. If auto-renewal is disabled for the newly-added CDB, fill in NOT_AUTO_RENEW.</p> 
     * @return CdbAutoRenew <p>If you use a monthly subscription cluster and need to purchase a CDB, determine whether to enable auto-renewal for the CDB. Default value: AUTO_RENEW. If auto-renewal is disabled for the newly-added CDB, fill in NOT_AUTO_RENEW.</p>
     */
    public String getCdbAutoRenew() {
        return this.CdbAutoRenew;
    }

    /**
     * Set <p>If you use a monthly subscription cluster and need to purchase a CDB, determine whether to enable auto-renewal for the CDB. Default value: AUTO_RENEW. If auto-renewal is disabled for the newly-added CDB, fill in NOT_AUTO_RENEW.</p>
     * @param CdbAutoRenew <p>If you use a monthly subscription cluster and need to purchase a CDB, determine whether to enable auto-renewal for the CDB. Default value: AUTO_RENEW. If auto-renewal is disabled for the newly-added CDB, fill in NOT_AUTO_RENEW.</p>
     */
    public void setCdbAutoRenew(String CdbAutoRenew) {
        this.CdbAutoRenew = CdbAutoRenew;
    }

    /**
     * Get <p>Hive shared metadata database type. Valid values:</p><li>EMR_NEW_META: created by the cluster by default</li><li>EMR_EXIT_METE: EMR-MetaDB specified by the cluster</li><li>USER_CUSTOM_META: custom MetaDB used by the cluster</li> 
     * @return MetaType <p>Hive shared metadata database type. Valid values:</p><li>EMR_NEW_META: created by the cluster by default</li><li>EMR_EXIT_METE: EMR-MetaDB specified by the cluster</li><li>USER_CUSTOM_META: custom MetaDB used by the cluster</li>
     */
    public String getMetaType() {
        return this.MetaType;
    }

    /**
     * Set <p>Hive shared metadata database type. Valid values:</p><li>EMR_NEW_META: created by the cluster by default</li><li>EMR_EXIT_METE: EMR-MetaDB specified by the cluster</li><li>USER_CUSTOM_META: custom MetaDB used by the cluster</li>
     * @param MetaType <p>Hive shared metadata database type. Valid values:</p><li>EMR_NEW_META: created by the cluster by default</li><li>EMR_EXIT_METE: EMR-MetaDB specified by the cluster</li><li>USER_CUSTOM_META: custom MetaDB used by the cluster</li>
     */
    public void setMetaType(String MetaType) {
        this.MetaType = MetaType;
    }

    /**
     * Get <p>EMR-MetaDB instance.</p> 
     * @return UnifyMetaInstanceId <p>EMR-MetaDB instance.</p>
     */
    public String getUnifyMetaInstanceId() {
        return this.UnifyMetaInstanceId;
    }

    /**
     * Set <p>EMR-MetaDB instance.</p>
     * @param UnifyMetaInstanceId <p>EMR-MetaDB instance.</p>
     */
    public void setUnifyMetaInstanceId(String UnifyMetaInstanceId) {
        this.UnifyMetaInstanceId = UnifyMetaInstanceId;
    }

    /**
     * Get <p>Custom MetaDB information.</p> 
     * @return MetaDBInfo <p>Custom MetaDB information.</p>
     */
    public CustomMetaInfo getMetaDBInfo() {
        return this.MetaDBInfo;
    }

    /**
     * Set <p>Custom MetaDB information.</p>
     * @param MetaDBInfo <p>Custom MetaDB information.</p>
     */
    public void setMetaDBInfo(CustomMetaInfo MetaDBInfo) {
        this.MetaDBInfo = MetaDBInfo;
    }

    /**
     * Get <p>Shared component information.</p> 
     * @return ExternalService <p>Shared component information.</p>
     */
    public ExternalService [] getExternalService() {
        return this.ExternalService;
    }

    /**
     * Set <p>Shared component information.</p>
     * @param ExternalService <p>Shared component information.</p>
     */
    public void setExternalService(ExternalService [] ExternalService) {
        this.ExternalService = ExternalService;
    }

    /**
     * Get <p>Tag information.</p> 
     * @return Tags <p>Tag information.</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>Tag information.</p>
     * @param Tags <p>Tag information.</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>Pod specification information of the role.</p> 
     * @return CloudResources <p>Pod specification information of the role.</p>
     */
    public CloudResource [] getCloudResources() {
        return this.CloudResources;
    }

    /**
     * Set <p>Pod specification information of the role.</p>
     * @param CloudResources <p>Pod specification information of the role.</p>
     */
    public void setCloudResources(CloudResource [] CloudResources) {
        this.CloudResources = CloudResources;
    }

    /**
     * Get <p>Custom deployment information.</p> 
     * @return ServiceDeployInfoList <p>Custom deployment information.</p>
     */
    public ServiceDeployInfo [] getServiceDeployInfoList() {
        return this.ServiceDeployInfoList;
    }

    /**
     * Set <p>Custom deployment information.</p>
     * @param ServiceDeployInfoList <p>Custom deployment information.</p>
     */
    public void setServiceDeployInfoList(ServiceDeployInfo [] ServiceDeployInfoList) {
        this.ServiceDeployInfoList = ServiceDeployInfoList;
    }

    /**
     * Get <p>Database version.</p> 
     * @return DefaultMetaVersion <p>Database version.</p>
     */
    public String getDefaultMetaVersion() {
        return this.DefaultMetaVersion;
    }

    /**
     * Set <p>Database version.</p>
     * @param DefaultMetaVersion <p>Database version.</p>
     */
    public void setDefaultMetaVersion(String DefaultMetaVersion) {
        this.DefaultMetaVersion = DefaultMetaVersion;
    }

    /**
     * Get <p>Whether to enable audit.</p> 
     * @return NeedCdbAudit <p>Whether to enable audit.</p>
     */
    public Long getNeedCdbAudit() {
        return this.NeedCdbAudit;
    }

    /**
     * Set <p>Whether to enable audit.</p>
     * @param NeedCdbAudit <p>Whether to enable audit.</p>
     */
    public void setNeedCdbAudit(Long NeedCdbAudit) {
        this.NeedCdbAudit = NeedCdbAudit;
    }

    /**
     * Get <p>Additional container configuration.</p> 
     * @return ContainerExtraConf <p>Additional container configuration.</p>
     */
    public ContainerExtraConf getContainerExtraConf() {
        return this.ContainerExtraConf;
    }

    /**
     * Set <p>Additional container configuration.</p>
     * @param ContainerExtraConf <p>Additional container configuration.</p>
     */
    public void setContainerExtraConf(ContainerExtraConf ContainerExtraConf) {
        this.ContainerExtraConf = ContainerExtraConf;
    }

    /**
     * Get <p>Whether to forcibly check the validity of custom components. Currently, it is available only for the Terraform side.</p> 
     * @return CheckServiceDeployInfo <p>Whether to forcibly check the validity of custom components. Currently, it is available only for the Terraform side.</p>
     */
    public Boolean getCheckServiceDeployInfo() {
        return this.CheckServiceDeployInfo;
    }

    /**
     * Set <p>Whether to forcibly check the validity of custom components. Currently, it is available only for the Terraform side.</p>
     * @param CheckServiceDeployInfo <p>Whether to forcibly check the validity of custom components. Currently, it is available only for the Terraform side.</p>
     */
    public void setCheckServiceDeployInfo(Boolean CheckServiceDeployInfo) {
        this.CheckServiceDeployInfo = CheckServiceDeployInfo;
    }

    /**
     * Get <p>Custom MetaDB information.</p> 
     * @return MetaDBGroupInfo <p>Custom MetaDB information.</p>
     */
    public CustomMetaDBInfo [] getMetaDBGroupInfo() {
        return this.MetaDBGroupInfo;
    }

    /**
     * Set <p>Custom MetaDB information.</p>
     * @param MetaDBGroupInfo <p>Custom MetaDB information.</p>
     */
    public void setMetaDBGroupInfo(CustomMetaDBInfo [] MetaDBGroupInfo) {
        this.MetaDBGroupInfo = MetaDBGroupInfo;
    }

    public InstallSoftwareRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstallSoftwareRequest(InstallSoftwareRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SoftInfo != null) {
            this.SoftInfo = new String[source.SoftInfo.length];
            for (int i = 0; i < source.SoftInfo.length; i++) {
                this.SoftInfo[i] = new String(source.SoftInfo[i]);
            }
        }
        if (source.CdbAutoRenew != null) {
            this.CdbAutoRenew = new String(source.CdbAutoRenew);
        }
        if (source.MetaType != null) {
            this.MetaType = new String(source.MetaType);
        }
        if (source.UnifyMetaInstanceId != null) {
            this.UnifyMetaInstanceId = new String(source.UnifyMetaInstanceId);
        }
        if (source.MetaDBInfo != null) {
            this.MetaDBInfo = new CustomMetaInfo(source.MetaDBInfo);
        }
        if (source.ExternalService != null) {
            this.ExternalService = new ExternalService[source.ExternalService.length];
            for (int i = 0; i < source.ExternalService.length; i++) {
                this.ExternalService[i] = new ExternalService(source.ExternalService[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.CloudResources != null) {
            this.CloudResources = new CloudResource[source.CloudResources.length];
            for (int i = 0; i < source.CloudResources.length; i++) {
                this.CloudResources[i] = new CloudResource(source.CloudResources[i]);
            }
        }
        if (source.ServiceDeployInfoList != null) {
            this.ServiceDeployInfoList = new ServiceDeployInfo[source.ServiceDeployInfoList.length];
            for (int i = 0; i < source.ServiceDeployInfoList.length; i++) {
                this.ServiceDeployInfoList[i] = new ServiceDeployInfo(source.ServiceDeployInfoList[i]);
            }
        }
        if (source.DefaultMetaVersion != null) {
            this.DefaultMetaVersion = new String(source.DefaultMetaVersion);
        }
        if (source.NeedCdbAudit != null) {
            this.NeedCdbAudit = new Long(source.NeedCdbAudit);
        }
        if (source.ContainerExtraConf != null) {
            this.ContainerExtraConf = new ContainerExtraConf(source.ContainerExtraConf);
        }
        if (source.CheckServiceDeployInfo != null) {
            this.CheckServiceDeployInfo = new Boolean(source.CheckServiceDeployInfo);
        }
        if (source.MetaDBGroupInfo != null) {
            this.MetaDBGroupInfo = new CustomMetaDBInfo[source.MetaDBGroupInfo.length];
            for (int i = 0; i < source.MetaDBGroupInfo.length; i++) {
                this.MetaDBGroupInfo[i] = new CustomMetaDBInfo(source.MetaDBGroupInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "SoftInfo.", this.SoftInfo);
        this.setParamSimple(map, prefix + "CdbAutoRenew", this.CdbAutoRenew);
        this.setParamSimple(map, prefix + "MetaType", this.MetaType);
        this.setParamSimple(map, prefix + "UnifyMetaInstanceId", this.UnifyMetaInstanceId);
        this.setParamObj(map, prefix + "MetaDBInfo.", this.MetaDBInfo);
        this.setParamArrayObj(map, prefix + "ExternalService.", this.ExternalService);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArrayObj(map, prefix + "CloudResources.", this.CloudResources);
        this.setParamArrayObj(map, prefix + "ServiceDeployInfoList.", this.ServiceDeployInfoList);
        this.setParamSimple(map, prefix + "DefaultMetaVersion", this.DefaultMetaVersion);
        this.setParamSimple(map, prefix + "NeedCdbAudit", this.NeedCdbAudit);
        this.setParamObj(map, prefix + "ContainerExtraConf.", this.ContainerExtraConf);
        this.setParamSimple(map, prefix + "CheckServiceDeployInfo", this.CheckServiceDeployInfo);
        this.setParamArrayObj(map, prefix + "MetaDBGroupInfo.", this.MetaDBGroupInfo);

    }
}

