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

public class InquiryPriceCreateInstanceRequest extends AbstractModel {

    /**
    * <p>Time unit for purchasing instances. Valid values:</p><li>s: indicates seconds. When PayMode is set to 0, TimeUnit can only be set to s.</li><li>m: indicates months. When PayMode is set to 1, TimeUnit can only be set to m.</li>
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * <p>Instance purchase duration, which is used together with TimeUnit.</p><li>When TimeUnit is set to s, this parameter can only be set to 3600, indicating a pay-as-you-go instance.</li><li>When TimeUnit is set to m, the value set for this parameter indicates the subscription duration of the instance. For example, 1 indicates a one-month subscription.</li>
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * <p>Currency type. Valid values:</p><li>CNY: RMB</li>
    */
    @SerializedName("Currency")
    @Expose
    private String Currency;

    /**
    * <p>Instance billing mode. Valid values:</p><li>0: pay-as-you-go</li><li>1: yearly/monthly subscription</li>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * <p>Whether to enable high availability for the node. Valid values:</p><li>0: no</li><li>1: yes</li>
    */
    @SerializedName("SupportHA")
    @Expose
    private Long SupportHA;

    /**
    * <p>List of deployed components. For different EMR product IDs, different required component lists need to be set (ProductId: For details about its meaning, see the ProductId parameter). Valid values: <li>When ProductId is set to 2 (EMR-V2.0.1), the required components include hdfs-2.7.3, yarn-2.7.3, zookeeper-3.4.9, and knox-1.2.0.</li><li>When ProductId is set to 16 (EMR-V2.3.0), the required components include hdfs-2.8.5, yarn-2.8.5, zookeeper-3.5.5, and knox-1.2.0.</li><li>When ProductId is set to 20 (EMR-V2.5.0), the required components include hdfs-2.8.5, yarn-2.8.5, zookeeper-3.6.1, and knox-1.2.0.</li><li>When ProductId is set to 30 (EMR-V2.6.0), the required components include hdfs-2.8.5, yarn-2.8.5, zookeeper-3.6.1, openldap-2.4.44, and knox-1.2.0.</li><li>When ProductId is set to 38 (EMR-V2.7.0), the required components include hdfs-2.8.5, yarn-2.8.5, zookeeper-3.6.3, openldap-2.4.44, and knox-1.6.1.</li><li>When ProductId is set to 57 (EMR-V2.8.0), the required components include hdfs-2.8.5, yarn-2.8.5, zookeeper-3.6.3, openldap-2.4.44, and knox-1.6.1.</li><li>When ProductId is set to 7 (EMR-V3.0.0), the required components include hdfs-3.1.2, yarn-3.1.2, zookeeper-3.4.9, and knox-1.2.0.</li><li>When ProductId is set to 25 (EMR-V3.1.0), the required components include hdfs-3.1.2, yarn-3.1.2, zookeeper-3.6.1, and knox-1.2.0.</li><li>When ProductId is set to 31 (EMR-V3.1.1), the required components include hdfs-3.1.2, yarn-3.1.2, zookeeper-3.6.1, and knox-1.2.0.</li><li>When ProductId is set to 28 (EMR-V3.2.0), the required components include hdfs-3.2.2, yarn-3.2.2, zookeeper-3.6.1, and knox-1.2.0.</li><li>When ProductId is set to 33 (EMR-V3.2.1), the required components include hdfs-3.2.2, yarn-3.2.2, zookeeper-3.6.1, openldap-2.4.44, and knox-1.2.0.</li><li>When ProductId is set to 34 (EMR-V3.3.0), the required components include hdfs-3.2.2, yarn-3.2.2, zookeeper-3.6.1, openldap-2.4.44, and knox-1.2.0.</li><li>When ProductId is set to 37 (EMR-V3.4.0), the required components include hdfs-3.2.2, yarn-3.2.2, zookeeper-3.6.3, openldap-2.4.44, and knox-1.6.1.</li><li>When ProductId is set to 44 (EMR-V3.5.0), the required components include hdfs-3.2.2, yarn-3.2.2, zookeeper-3.6.3, openldap-2.4.44, and knox-1.6.1.</li><li>When ProductId is set to 53 (EMR-V3.6.0), the required components include hdfs-3.2.2, yarn-3.2.2, zookeeper-3.6.3, openldap-2.4.44, and knox-1.6.1.</li><li>When ProductId is set to 58 (EMR-V3.6.1), the required components include hdfs-3.2.2, yarn-3.2.2, zookeeper-3.6.3, openldap-2.4.46, and knox-1.6.1.</li><li>When ProductId is set to 47 (EMR-V4.0.0), the required components include hdfs-3.2.2, yarn-3.2.2, zookeeper-3.6.3, openldap-2.4.44, and knox-1.6.1.</li></p>
    */
    @SerializedName("Software")
    @Expose
    private String [] Software;

    /**
    * <p>Node specifications for price inquiry.</p>
    */
    @SerializedName("ResourceSpec")
    @Expose
    private NewResourceSpec ResourceSpec;

    /**
    * <p>Location of the instance. This parameter can be used to specify attributes such as the AZ and associated project of the instance.</p>
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * <p>VPC-related information configuration. This parameter can be used to specify the VPC ID, subnet ID, and so on.</p>
    */
    @SerializedName("VPCSettings")
    @Expose
    private VPCSettings VPCSettings;

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
    * <p>Product ID. Different product IDs indicate different EMR product versions. Valid values: <li>2: EMR-V2.0.1</li><li>16: EMR-V2.3.0</li><li>20: EMR-V2.5.0</li><li>30: EMR-V2.6.0</li><li>38: EMR-V2.7.0</li><li>57: EMR-V2.8.0</li><li>7: EMR-V3.0.0</li><li>25: EMR-V3.1.0</li><li>31: EMR-V3.1.1</li><li>28: EMR-V3.2.0</li><li>33: EMR-V3.2.1</li><li>34: EMR-V3.3.0</li><li>37: EMR-V3.4.0</li><li>44: EMR-V3.5.0</li><li>53: EMR-V3.6.0</li><li>58: EMR-V3.6.1</li><li>47: EMR-V4.0.0</li></p>
    */
    @SerializedName("ProductId")
    @Expose
    private Long ProductId;

    /**
    * <p>Scenario-based values: Hadoop-Kudu, Hadoop-Zookeeper, Hadoop-Presto, and Hadoop-Hbase.</p>
    */
    @SerializedName("SceneName")
    @Expose
    private String SceneName;

    /**
    * <p>Shared component information.</p>
    */
    @SerializedName("ExternalService")
    @Expose
    private ExternalService [] ExternalService;

    /**
    * <p>Default value: 0. It is changed to 1 after the cross-AZ feature is supported.</p>
    */
    @SerializedName("VersionID")
    @Expose
    private Long VersionID;

    /**
    * <p>Specification information of the AZ.</p>
    */
    @SerializedName("MultiZoneSettings")
    @Expose
    private MultiZoneSetting [] MultiZoneSettings;

    /**
    * <p>Database version.</p>
    */
    @SerializedName("DefaultMetaVersion")
    @Expose
    private String DefaultMetaVersion;

    /**
    * <p>Whether to enable audit. Valid values: 0 (no) and 1 (yes).</p>
    */
    @SerializedName("NeedCdbAudit")
    @Expose
    private Long NeedCdbAudit;

    /**
    * <p>Custom database data.</p>
    */
    @SerializedName("MetaDBGroupInfo")
    @Expose
    private CustomMetaDBInfo [] MetaDBGroupInfo;

    /**
     * Get <p>Time unit for purchasing instances. Valid values:</p><li>s: indicates seconds. When PayMode is set to 0, TimeUnit can only be set to s.</li><li>m: indicates months. When PayMode is set to 1, TimeUnit can only be set to m.</li> 
     * @return TimeUnit <p>Time unit for purchasing instances. Valid values:</p><li>s: indicates seconds. When PayMode is set to 0, TimeUnit can only be set to s.</li><li>m: indicates months. When PayMode is set to 1, TimeUnit can only be set to m.</li>
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set <p>Time unit for purchasing instances. Valid values:</p><li>s: indicates seconds. When PayMode is set to 0, TimeUnit can only be set to s.</li><li>m: indicates months. When PayMode is set to 1, TimeUnit can only be set to m.</li>
     * @param TimeUnit <p>Time unit for purchasing instances. Valid values:</p><li>s: indicates seconds. When PayMode is set to 0, TimeUnit can only be set to s.</li><li>m: indicates months. When PayMode is set to 1, TimeUnit can only be set to m.</li>
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get <p>Instance purchase duration, which is used together with TimeUnit.</p><li>When TimeUnit is set to s, this parameter can only be set to 3600, indicating a pay-as-you-go instance.</li><li>When TimeUnit is set to m, the value set for this parameter indicates the subscription duration of the instance. For example, 1 indicates a one-month subscription.</li> 
     * @return TimeSpan <p>Instance purchase duration, which is used together with TimeUnit.</p><li>When TimeUnit is set to s, this parameter can only be set to 3600, indicating a pay-as-you-go instance.</li><li>When TimeUnit is set to m, the value set for this parameter indicates the subscription duration of the instance. For example, 1 indicates a one-month subscription.</li>
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set <p>Instance purchase duration, which is used together with TimeUnit.</p><li>When TimeUnit is set to s, this parameter can only be set to 3600, indicating a pay-as-you-go instance.</li><li>When TimeUnit is set to m, the value set for this parameter indicates the subscription duration of the instance. For example, 1 indicates a one-month subscription.</li>
     * @param TimeSpan <p>Instance purchase duration, which is used together with TimeUnit.</p><li>When TimeUnit is set to s, this parameter can only be set to 3600, indicating a pay-as-you-go instance.</li><li>When TimeUnit is set to m, the value set for this parameter indicates the subscription duration of the instance. For example, 1 indicates a one-month subscription.</li>
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get <p>Currency type. Valid values:</p><li>CNY: RMB</li> 
     * @return Currency <p>Currency type. Valid values:</p><li>CNY: RMB</li>
     */
    public String getCurrency() {
        return this.Currency;
    }

    /**
     * Set <p>Currency type. Valid values:</p><li>CNY: RMB</li>
     * @param Currency <p>Currency type. Valid values:</p><li>CNY: RMB</li>
     */
    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }

    /**
     * Get <p>Instance billing mode. Valid values:</p><li>0: pay-as-you-go</li><li>1: yearly/monthly subscription</li> 
     * @return PayMode <p>Instance billing mode. Valid values:</p><li>0: pay-as-you-go</li><li>1: yearly/monthly subscription</li>
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>Instance billing mode. Valid values:</p><li>0: pay-as-you-go</li><li>1: yearly/monthly subscription</li>
     * @param PayMode <p>Instance billing mode. Valid values:</p><li>0: pay-as-you-go</li><li>1: yearly/monthly subscription</li>
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>Whether to enable high availability for the node. Valid values:</p><li>0: no</li><li>1: yes</li> 
     * @return SupportHA <p>Whether to enable high availability for the node. Valid values:</p><li>0: no</li><li>1: yes</li>
     */
    public Long getSupportHA() {
        return this.SupportHA;
    }

    /**
     * Set <p>Whether to enable high availability for the node. Valid values:</p><li>0: no</li><li>1: yes</li>
     * @param SupportHA <p>Whether to enable high availability for the node. Valid values:</p><li>0: no</li><li>1: yes</li>
     */
    public void setSupportHA(Long SupportHA) {
        this.SupportHA = SupportHA;
    }

    /**
     * Get <p>List of deployed components. For different EMR product IDs, different required component lists need to be set (ProductId: For details about its meaning, see the ProductId parameter). Valid values: <li>When ProductId is set to 2 (EMR-V2.0.1), the required components include hdfs-2.7.3, yarn-2.7.3, zookeeper-3.4.9, and knox-1.2.0.</li><li>When ProductId is set to 16 (EMR-V2.3.0), the required components include hdfs-2.8.5, yarn-2.8.5, zookeeper-3.5.5, and knox-1.2.0.</li><li>When ProductId is set to 20 (EMR-V2.5.0), the required components include hdfs-2.8.5, yarn-2.8.5, zookeeper-3.6.1, and knox-1.2.0.</li><li>When ProductId is set to 30 (EMR-V2.6.0), the required components include hdfs-2.8.5, yarn-2.8.5, zookeeper-3.6.1, openldap-2.4.44, and knox-1.2.0.</li><li>When ProductId is set to 38 (EMR-V2.7.0), the required components include hdfs-2.8.5, yarn-2.8.5, zookeeper-3.6.3, openldap-2.4.44, and knox-1.6.1.</li><li>When ProductId is set to 57 (EMR-V2.8.0), the required components include hdfs-2.8.5, yarn-2.8.5, zookeeper-3.6.3, openldap-2.4.44, and knox-1.6.1.</li><li>When ProductId is set to 7 (EMR-V3.0.0), the required components include hdfs-3.1.2, yarn-3.1.2, zookeeper-3.4.9, and knox-1.2.0.</li><li>When ProductId is set to 25 (EMR-V3.1.0), the required components include hdfs-3.1.2, yarn-3.1.2, zookeeper-3.6.1, and knox-1.2.0.</li><li>When ProductId is set to 31 (EMR-V3.1.1), the required components include hdfs-3.1.2, yarn-3.1.2, zookeeper-3.6.1, and knox-1.2.0.</li><li>When ProductId is set to 28 (EMR-V3.2.0), the required components include hdfs-3.2.2, yarn-3.2.2, zookeeper-3.6.1, and knox-1.2.0.</li><li>When ProductId is set to 33 (EMR-V3.2.1), the required components include hdfs-3.2.2, yarn-3.2.2, zookeeper-3.6.1, openldap-2.4.44, and knox-1.2.0.</li><li>When ProductId is set to 34 (EMR-V3.3.0), the required components include hdfs-3.2.2, yarn-3.2.2, zookeeper-3.6.1, openldap-2.4.44, and knox-1.2.0.</li><li>When ProductId is set to 37 (EMR-V3.4.0), the required components include hdfs-3.2.2, yarn-3.2.2, zookeeper-3.6.3, openldap-2.4.44, and knox-1.6.1.</li><li>When ProductId is set to 44 (EMR-V3.5.0), the required components include hdfs-3.2.2, yarn-3.2.2, zookeeper-3.6.3, openldap-2.4.44, and knox-1.6.1.</li><li>When ProductId is set to 53 (EMR-V3.6.0), the required components include hdfs-3.2.2, yarn-3.2.2, zookeeper-3.6.3, openldap-2.4.44, and knox-1.6.1.</li><li>When ProductId is set to 58 (EMR-V3.6.1), the required components include hdfs-3.2.2, yarn-3.2.2, zookeeper-3.6.3, openldap-2.4.46, and knox-1.6.1.</li><li>When ProductId is set to 47 (EMR-V4.0.0), the required components include hdfs-3.2.2, yarn-3.2.2, zookeeper-3.6.3, openldap-2.4.44, and knox-1.6.1.</li></p> 
     * @return Software <p>List of deployed components. For different EMR product IDs, different required component lists need to be set (ProductId: For details about its meaning, see the ProductId parameter). Valid values: <li>When ProductId is set to 2 (EMR-V2.0.1), the required components include hdfs-2.7.3, yarn-2.7.3, zookeeper-3.4.9, and knox-1.2.0.</li><li>When ProductId is set to 16 (EMR-V2.3.0), the required components include hdfs-2.8.5, yarn-2.8.5, zookeeper-3.5.5, and knox-1.2.0.</li><li>When ProductId is set to 20 (EMR-V2.5.0), the required components include hdfs-2.8.5, yarn-2.8.5, zookeeper-3.6.1, and knox-1.2.0.</li><li>When ProductId is set to 30 (EMR-V2.6.0), the required components include hdfs-2.8.5, yarn-2.8.5, zookeeper-3.6.1, openldap-2.4.44, and knox-1.2.0.</li><li>When ProductId is set to 38 (EMR-V2.7.0), the required components include hdfs-2.8.5, yarn-2.8.5, zookeeper-3.6.3, openldap-2.4.44, and knox-1.6.1.</li><li>When ProductId is set to 57 (EMR-V2.8.0), the required components include hdfs-2.8.5, yarn-2.8.5, zookeeper-3.6.3, openldap-2.4.44, and knox-1.6.1.</li><li>When ProductId is set to 7 (EMR-V3.0.0), the required components include hdfs-3.1.2, yarn-3.1.2, zookeeper-3.4.9, and knox-1.2.0.</li><li>When ProductId is set to 25 (EMR-V3.1.0), the required components include hdfs-3.1.2, yarn-3.1.2, zookeeper-3.6.1, and knox-1.2.0.</li><li>When ProductId is set to 31 (EMR-V3.1.1), the required components include hdfs-3.1.2, yarn-3.1.2, zookeeper-3.6.1, and knox-1.2.0.</li><li>When ProductId is set to 28 (EMR-V3.2.0), the required components include hdfs-3.2.2, yarn-3.2.2, zookeeper-3.6.1, and knox-1.2.0.</li><li>When ProductId is set to 33 (EMR-V3.2.1), the required components include hdfs-3.2.2, yarn-3.2.2, zookeeper-3.6.1, openldap-2.4.44, and knox-1.2.0.</li><li>When ProductId is set to 34 (EMR-V3.3.0), the required components include hdfs-3.2.2, yarn-3.2.2, zookeeper-3.6.1, openldap-2.4.44, and knox-1.2.0.</li><li>When ProductId is set to 37 (EMR-V3.4.0), the required components include hdfs-3.2.2, yarn-3.2.2, zookeeper-3.6.3, openldap-2.4.44, and knox-1.6.1.</li><li>When ProductId is set to 44 (EMR-V3.5.0), the required components include hdfs-3.2.2, yarn-3.2.2, zookeeper-3.6.3, openldap-2.4.44, and knox-1.6.1.</li><li>When ProductId is set to 53 (EMR-V3.6.0), the required components include hdfs-3.2.2, yarn-3.2.2, zookeeper-3.6.3, openldap-2.4.44, and knox-1.6.1.</li><li>When ProductId is set to 58 (EMR-V3.6.1), the required components include hdfs-3.2.2, yarn-3.2.2, zookeeper-3.6.3, openldap-2.4.46, and knox-1.6.1.</li><li>When ProductId is set to 47 (EMR-V4.0.0), the required components include hdfs-3.2.2, yarn-3.2.2, zookeeper-3.6.3, openldap-2.4.44, and knox-1.6.1.</li></p>
     */
    public String [] getSoftware() {
        return this.Software;
    }

    /**
     * Set <p>List of deployed components. For different EMR product IDs, different required component lists need to be set (ProductId: For details about its meaning, see the ProductId parameter). Valid values: <li>When ProductId is set to 2 (EMR-V2.0.1), the required components include hdfs-2.7.3, yarn-2.7.3, zookeeper-3.4.9, and knox-1.2.0.</li><li>When ProductId is set to 16 (EMR-V2.3.0), the required components include hdfs-2.8.5, yarn-2.8.5, zookeeper-3.5.5, and knox-1.2.0.</li><li>When ProductId is set to 20 (EMR-V2.5.0), the required components include hdfs-2.8.5, yarn-2.8.5, zookeeper-3.6.1, and knox-1.2.0.</li><li>When ProductId is set to 30 (EMR-V2.6.0), the required components include hdfs-2.8.5, yarn-2.8.5, zookeeper-3.6.1, openldap-2.4.44, and knox-1.2.0.</li><li>When ProductId is set to 38 (EMR-V2.7.0), the required components include hdfs-2.8.5, yarn-2.8.5, zookeeper-3.6.3, openldap-2.4.44, and knox-1.6.1.</li><li>When ProductId is set to 57 (EMR-V2.8.0), the required components include hdfs-2.8.5, yarn-2.8.5, zookeeper-3.6.3, openldap-2.4.44, and knox-1.6.1.</li><li>When ProductId is set to 7 (EMR-V3.0.0), the required components include hdfs-3.1.2, yarn-3.1.2, zookeeper-3.4.9, and knox-1.2.0.</li><li>When ProductId is set to 25 (EMR-V3.1.0), the required components include hdfs-3.1.2, yarn-3.1.2, zookeeper-3.6.1, and knox-1.2.0.</li><li>When ProductId is set to 31 (EMR-V3.1.1), the required components include hdfs-3.1.2, yarn-3.1.2, zookeeper-3.6.1, and knox-1.2.0.</li><li>When ProductId is set to 28 (EMR-V3.2.0), the required components include hdfs-3.2.2, yarn-3.2.2, zookeeper-3.6.1, and knox-1.2.0.</li><li>When ProductId is set to 33 (EMR-V3.2.1), the required components include hdfs-3.2.2, yarn-3.2.2, zookeeper-3.6.1, openldap-2.4.44, and knox-1.2.0.</li><li>When ProductId is set to 34 (EMR-V3.3.0), the required components include hdfs-3.2.2, yarn-3.2.2, zookeeper-3.6.1, openldap-2.4.44, and knox-1.2.0.</li><li>When ProductId is set to 37 (EMR-V3.4.0), the required components include hdfs-3.2.2, yarn-3.2.2, zookeeper-3.6.3, openldap-2.4.44, and knox-1.6.1.</li><li>When ProductId is set to 44 (EMR-V3.5.0), the required components include hdfs-3.2.2, yarn-3.2.2, zookeeper-3.6.3, openldap-2.4.44, and knox-1.6.1.</li><li>When ProductId is set to 53 (EMR-V3.6.0), the required components include hdfs-3.2.2, yarn-3.2.2, zookeeper-3.6.3, openldap-2.4.44, and knox-1.6.1.</li><li>When ProductId is set to 58 (EMR-V3.6.1), the required components include hdfs-3.2.2, yarn-3.2.2, zookeeper-3.6.3, openldap-2.4.46, and knox-1.6.1.</li><li>When ProductId is set to 47 (EMR-V4.0.0), the required components include hdfs-3.2.2, yarn-3.2.2, zookeeper-3.6.3, openldap-2.4.44, and knox-1.6.1.</li></p>
     * @param Software <p>List of deployed components. For different EMR product IDs, different required component lists need to be set (ProductId: For details about its meaning, see the ProductId parameter). Valid values: <li>When ProductId is set to 2 (EMR-V2.0.1), the required components include hdfs-2.7.3, yarn-2.7.3, zookeeper-3.4.9, and knox-1.2.0.</li><li>When ProductId is set to 16 (EMR-V2.3.0), the required components include hdfs-2.8.5, yarn-2.8.5, zookeeper-3.5.5, and knox-1.2.0.</li><li>When ProductId is set to 20 (EMR-V2.5.0), the required components include hdfs-2.8.5, yarn-2.8.5, zookeeper-3.6.1, and knox-1.2.0.</li><li>When ProductId is set to 30 (EMR-V2.6.0), the required components include hdfs-2.8.5, yarn-2.8.5, zookeeper-3.6.1, openldap-2.4.44, and knox-1.2.0.</li><li>When ProductId is set to 38 (EMR-V2.7.0), the required components include hdfs-2.8.5, yarn-2.8.5, zookeeper-3.6.3, openldap-2.4.44, and knox-1.6.1.</li><li>When ProductId is set to 57 (EMR-V2.8.0), the required components include hdfs-2.8.5, yarn-2.8.5, zookeeper-3.6.3, openldap-2.4.44, and knox-1.6.1.</li><li>When ProductId is set to 7 (EMR-V3.0.0), the required components include hdfs-3.1.2, yarn-3.1.2, zookeeper-3.4.9, and knox-1.2.0.</li><li>When ProductId is set to 25 (EMR-V3.1.0), the required components include hdfs-3.1.2, yarn-3.1.2, zookeeper-3.6.1, and knox-1.2.0.</li><li>When ProductId is set to 31 (EMR-V3.1.1), the required components include hdfs-3.1.2, yarn-3.1.2, zookeeper-3.6.1, and knox-1.2.0.</li><li>When ProductId is set to 28 (EMR-V3.2.0), the required components include hdfs-3.2.2, yarn-3.2.2, zookeeper-3.6.1, and knox-1.2.0.</li><li>When ProductId is set to 33 (EMR-V3.2.1), the required components include hdfs-3.2.2, yarn-3.2.2, zookeeper-3.6.1, openldap-2.4.44, and knox-1.2.0.</li><li>When ProductId is set to 34 (EMR-V3.3.0), the required components include hdfs-3.2.2, yarn-3.2.2, zookeeper-3.6.1, openldap-2.4.44, and knox-1.2.0.</li><li>When ProductId is set to 37 (EMR-V3.4.0), the required components include hdfs-3.2.2, yarn-3.2.2, zookeeper-3.6.3, openldap-2.4.44, and knox-1.6.1.</li><li>When ProductId is set to 44 (EMR-V3.5.0), the required components include hdfs-3.2.2, yarn-3.2.2, zookeeper-3.6.3, openldap-2.4.44, and knox-1.6.1.</li><li>When ProductId is set to 53 (EMR-V3.6.0), the required components include hdfs-3.2.2, yarn-3.2.2, zookeeper-3.6.3, openldap-2.4.44, and knox-1.6.1.</li><li>When ProductId is set to 58 (EMR-V3.6.1), the required components include hdfs-3.2.2, yarn-3.2.2, zookeeper-3.6.3, openldap-2.4.46, and knox-1.6.1.</li><li>When ProductId is set to 47 (EMR-V4.0.0), the required components include hdfs-3.2.2, yarn-3.2.2, zookeeper-3.6.3, openldap-2.4.44, and knox-1.6.1.</li></p>
     */
    public void setSoftware(String [] Software) {
        this.Software = Software;
    }

    /**
     * Get <p>Node specifications for price inquiry.</p> 
     * @return ResourceSpec <p>Node specifications for price inquiry.</p>
     */
    public NewResourceSpec getResourceSpec() {
        return this.ResourceSpec;
    }

    /**
     * Set <p>Node specifications for price inquiry.</p>
     * @param ResourceSpec <p>Node specifications for price inquiry.</p>
     */
    public void setResourceSpec(NewResourceSpec ResourceSpec) {
        this.ResourceSpec = ResourceSpec;
    }

    /**
     * Get <p>Location of the instance. This parameter can be used to specify attributes such as the AZ and associated project of the instance.</p> 
     * @return Placement <p>Location of the instance. This parameter can be used to specify attributes such as the AZ and associated project of the instance.</p>
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * Set <p>Location of the instance. This parameter can be used to specify attributes such as the AZ and associated project of the instance.</p>
     * @param Placement <p>Location of the instance. This parameter can be used to specify attributes such as the AZ and associated project of the instance.</p>
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    /**
     * Get <p>VPC-related information configuration. This parameter can be used to specify the VPC ID, subnet ID, and so on.</p> 
     * @return VPCSettings <p>VPC-related information configuration. This parameter can be used to specify the VPC ID, subnet ID, and so on.</p>
     */
    public VPCSettings getVPCSettings() {
        return this.VPCSettings;
    }

    /**
     * Set <p>VPC-related information configuration. This parameter can be used to specify the VPC ID, subnet ID, and so on.</p>
     * @param VPCSettings <p>VPC-related information configuration. This parameter can be used to specify the VPC ID, subnet ID, and so on.</p>
     */
    public void setVPCSettings(VPCSettings VPCSettings) {
        this.VPCSettings = VPCSettings;
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
     * Get <p>Product ID. Different product IDs indicate different EMR product versions. Valid values: <li>2: EMR-V2.0.1</li><li>16: EMR-V2.3.0</li><li>20: EMR-V2.5.0</li><li>30: EMR-V2.6.0</li><li>38: EMR-V2.7.0</li><li>57: EMR-V2.8.0</li><li>7: EMR-V3.0.0</li><li>25: EMR-V3.1.0</li><li>31: EMR-V3.1.1</li><li>28: EMR-V3.2.0</li><li>33: EMR-V3.2.1</li><li>34: EMR-V3.3.0</li><li>37: EMR-V3.4.0</li><li>44: EMR-V3.5.0</li><li>53: EMR-V3.6.0</li><li>58: EMR-V3.6.1</li><li>47: EMR-V4.0.0</li></p> 
     * @return ProductId <p>Product ID. Different product IDs indicate different EMR product versions. Valid values: <li>2: EMR-V2.0.1</li><li>16: EMR-V2.3.0</li><li>20: EMR-V2.5.0</li><li>30: EMR-V2.6.0</li><li>38: EMR-V2.7.0</li><li>57: EMR-V2.8.0</li><li>7: EMR-V3.0.0</li><li>25: EMR-V3.1.0</li><li>31: EMR-V3.1.1</li><li>28: EMR-V3.2.0</li><li>33: EMR-V3.2.1</li><li>34: EMR-V3.3.0</li><li>37: EMR-V3.4.0</li><li>44: EMR-V3.5.0</li><li>53: EMR-V3.6.0</li><li>58: EMR-V3.6.1</li><li>47: EMR-V4.0.0</li></p>
     */
    public Long getProductId() {
        return this.ProductId;
    }

    /**
     * Set <p>Product ID. Different product IDs indicate different EMR product versions. Valid values: <li>2: EMR-V2.0.1</li><li>16: EMR-V2.3.0</li><li>20: EMR-V2.5.0</li><li>30: EMR-V2.6.0</li><li>38: EMR-V2.7.0</li><li>57: EMR-V2.8.0</li><li>7: EMR-V3.0.0</li><li>25: EMR-V3.1.0</li><li>31: EMR-V3.1.1</li><li>28: EMR-V3.2.0</li><li>33: EMR-V3.2.1</li><li>34: EMR-V3.3.0</li><li>37: EMR-V3.4.0</li><li>44: EMR-V3.5.0</li><li>53: EMR-V3.6.0</li><li>58: EMR-V3.6.1</li><li>47: EMR-V4.0.0</li></p>
     * @param ProductId <p>Product ID. Different product IDs indicate different EMR product versions. Valid values: <li>2: EMR-V2.0.1</li><li>16: EMR-V2.3.0</li><li>20: EMR-V2.5.0</li><li>30: EMR-V2.6.0</li><li>38: EMR-V2.7.0</li><li>57: EMR-V2.8.0</li><li>7: EMR-V3.0.0</li><li>25: EMR-V3.1.0</li><li>31: EMR-V3.1.1</li><li>28: EMR-V3.2.0</li><li>33: EMR-V3.2.1</li><li>34: EMR-V3.3.0</li><li>37: EMR-V3.4.0</li><li>44: EMR-V3.5.0</li><li>53: EMR-V3.6.0</li><li>58: EMR-V3.6.1</li><li>47: EMR-V4.0.0</li></p>
     */
    public void setProductId(Long ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get <p>Scenario-based values: Hadoop-Kudu, Hadoop-Zookeeper, Hadoop-Presto, and Hadoop-Hbase.</p> 
     * @return SceneName <p>Scenario-based values: Hadoop-Kudu, Hadoop-Zookeeper, Hadoop-Presto, and Hadoop-Hbase.</p>
     */
    public String getSceneName() {
        return this.SceneName;
    }

    /**
     * Set <p>Scenario-based values: Hadoop-Kudu, Hadoop-Zookeeper, Hadoop-Presto, and Hadoop-Hbase.</p>
     * @param SceneName <p>Scenario-based values: Hadoop-Kudu, Hadoop-Zookeeper, Hadoop-Presto, and Hadoop-Hbase.</p>
     */
    public void setSceneName(String SceneName) {
        this.SceneName = SceneName;
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
     * Get <p>Default value: 0. It is changed to 1 after the cross-AZ feature is supported.</p> 
     * @return VersionID <p>Default value: 0. It is changed to 1 after the cross-AZ feature is supported.</p>
     */
    public Long getVersionID() {
        return this.VersionID;
    }

    /**
     * Set <p>Default value: 0. It is changed to 1 after the cross-AZ feature is supported.</p>
     * @param VersionID <p>Default value: 0. It is changed to 1 after the cross-AZ feature is supported.</p>
     */
    public void setVersionID(Long VersionID) {
        this.VersionID = VersionID;
    }

    /**
     * Get <p>Specification information of the AZ.</p> 
     * @return MultiZoneSettings <p>Specification information of the AZ.</p>
     */
    public MultiZoneSetting [] getMultiZoneSettings() {
        return this.MultiZoneSettings;
    }

    /**
     * Set <p>Specification information of the AZ.</p>
     * @param MultiZoneSettings <p>Specification information of the AZ.</p>
     */
    public void setMultiZoneSettings(MultiZoneSetting [] MultiZoneSettings) {
        this.MultiZoneSettings = MultiZoneSettings;
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
     * Get <p>Whether to enable audit. Valid values: 0 (no) and 1 (yes).</p> 
     * @return NeedCdbAudit <p>Whether to enable audit. Valid values: 0 (no) and 1 (yes).</p>
     */
    public Long getNeedCdbAudit() {
        return this.NeedCdbAudit;
    }

    /**
     * Set <p>Whether to enable audit. Valid values: 0 (no) and 1 (yes).</p>
     * @param NeedCdbAudit <p>Whether to enable audit. Valid values: 0 (no) and 1 (yes).</p>
     */
    public void setNeedCdbAudit(Long NeedCdbAudit) {
        this.NeedCdbAudit = NeedCdbAudit;
    }

    /**
     * Get <p>Custom database data.</p> 
     * @return MetaDBGroupInfo <p>Custom database data.</p>
     */
    public CustomMetaDBInfo [] getMetaDBGroupInfo() {
        return this.MetaDBGroupInfo;
    }

    /**
     * Set <p>Custom database data.</p>
     * @param MetaDBGroupInfo <p>Custom database data.</p>
     */
    public void setMetaDBGroupInfo(CustomMetaDBInfo [] MetaDBGroupInfo) {
        this.MetaDBGroupInfo = MetaDBGroupInfo;
    }

    public InquiryPriceCreateInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquiryPriceCreateInstanceRequest(InquiryPriceCreateInstanceRequest source) {
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.Currency != null) {
            this.Currency = new String(source.Currency);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.SupportHA != null) {
            this.SupportHA = new Long(source.SupportHA);
        }
        if (source.Software != null) {
            this.Software = new String[source.Software.length];
            for (int i = 0; i < source.Software.length; i++) {
                this.Software[i] = new String(source.Software[i]);
            }
        }
        if (source.ResourceSpec != null) {
            this.ResourceSpec = new NewResourceSpec(source.ResourceSpec);
        }
        if (source.Placement != null) {
            this.Placement = new Placement(source.Placement);
        }
        if (source.VPCSettings != null) {
            this.VPCSettings = new VPCSettings(source.VPCSettings);
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
        if (source.ProductId != null) {
            this.ProductId = new Long(source.ProductId);
        }
        if (source.SceneName != null) {
            this.SceneName = new String(source.SceneName);
        }
        if (source.ExternalService != null) {
            this.ExternalService = new ExternalService[source.ExternalService.length];
            for (int i = 0; i < source.ExternalService.length; i++) {
                this.ExternalService[i] = new ExternalService(source.ExternalService[i]);
            }
        }
        if (source.VersionID != null) {
            this.VersionID = new Long(source.VersionID);
        }
        if (source.MultiZoneSettings != null) {
            this.MultiZoneSettings = new MultiZoneSetting[source.MultiZoneSettings.length];
            for (int i = 0; i < source.MultiZoneSettings.length; i++) {
                this.MultiZoneSettings[i] = new MultiZoneSetting(source.MultiZoneSettings[i]);
            }
        }
        if (source.DefaultMetaVersion != null) {
            this.DefaultMetaVersion = new String(source.DefaultMetaVersion);
        }
        if (source.NeedCdbAudit != null) {
            this.NeedCdbAudit = new Long(source.NeedCdbAudit);
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
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "Currency", this.Currency);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "SupportHA", this.SupportHA);
        this.setParamArraySimple(map, prefix + "Software.", this.Software);
        this.setParamObj(map, prefix + "ResourceSpec.", this.ResourceSpec);
        this.setParamObj(map, prefix + "Placement.", this.Placement);
        this.setParamObj(map, prefix + "VPCSettings.", this.VPCSettings);
        this.setParamSimple(map, prefix + "MetaType", this.MetaType);
        this.setParamSimple(map, prefix + "UnifyMetaInstanceId", this.UnifyMetaInstanceId);
        this.setParamObj(map, prefix + "MetaDBInfo.", this.MetaDBInfo);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "SceneName", this.SceneName);
        this.setParamArrayObj(map, prefix + "ExternalService.", this.ExternalService);
        this.setParamSimple(map, prefix + "VersionID", this.VersionID);
        this.setParamArrayObj(map, prefix + "MultiZoneSettings.", this.MultiZoneSettings);
        this.setParamSimple(map, prefix + "DefaultMetaVersion", this.DefaultMetaVersion);
        this.setParamSimple(map, prefix + "NeedCdbAudit", this.NeedCdbAudit);
        this.setParamArrayObj(map, prefix + "MetaDBGroupInfo.", this.MetaDBGroupInfo);

    }
}

