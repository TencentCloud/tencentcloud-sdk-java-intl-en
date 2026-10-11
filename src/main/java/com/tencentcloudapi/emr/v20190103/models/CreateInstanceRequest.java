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

public class CreateInstanceRequest extends AbstractModel {

    /**
    * <p>Product ID. Different product IDs indicate different EMR product versions. Valid values:<br>51: STARROCKS-V1.4.0<br>54: STARROCKS-V2.0.0<br>27: KAFKA-V1.0.0<br>50: KAFKA-V2.0.0<br>16: EMR-V2.3.0<br>20: EMR-V2.5.0<br>30: EMR-V2.6.0<br>38: EMR-V2.7.0<br>25: EMR-V3.1.0<br>33: EMR-V3.2.1<br>34: EMR-V3.3.0<br>37: EMR-V3.4.0<br>44: EMR-V3.5.0<br>53: EMR-V3.6.0<br>58: EMR-3.6.1<br>59: EMR-serverless-1.0.0<br>60: EMR-TKE-1.1.0<br>61: SR-V2.1.0<br>62: SR-V2.1.0-SharedData<br>63: SR-V2.1.0.tlinux<br>64: unified metadata management project<br>65: EMR-TKE-AI-1.0.0<br>66: RSS-1.0.0<br>67: SR-V2.2.0<br>68: SR-V2.2.0.tlinux<br>69: EMR-AI-1.1.0<br>70: SR-V2.2.1<br>71: EMR-3.7.0<br>72: EMR-serverless-1.0.1<br>73: KAFKA-2.0.1<br>74: SR-V2.2.2<br>75: EMR-TKE-AI-1.1.0<br>76: EMR-V3.7.1<br>77: SERVERLESS-TCBASE-1.0.0<br>78: EMR-V3.6.2<br>79: STARROCKS-V2.2.2<br>80: EMR-AI-V1.1.1</p>
    */
    @SerializedName("ProductId")
    @Expose
    private Long ProductId;

    /**
    * <p>List of deployed components. Different EMR product IDs correspond to different optional component lists (ProductId: For details about its meaning, see the ProductId request parameter). For details about how to query optional component lists for different product versions, see <a href="https://www.tencentcloud.com/document/product/589/20279?from_cn_redirect=1">Component Version</a>.<br>Example values: hive and flink.</p>
    */
    @SerializedName("Software")
    @Expose
    private String [] Software;

    /**
    * <p>Whether to enable high availability for the node. Valid values:</p><li>0: disables high availability for the node.</li><li>1: enables high availability for the node.</li>
    */
    @SerializedName("SupportHA")
    @Expose
    private Long SupportHA;

    /**
    * <p>Instance name.</p><li>The value can contain 6 to 36 characters.</li><li>Only Chinese characters, letters, digits, hyphens (-), and underscores (_) are allowed.</li>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>Instance billing mode. Valid values:</p><li>0: pay-as-you-go</li><li>1: yearly/monthly subscription</li>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * <p>Instance purchase duration, which is used together with TimeUnit.</p><li>When TimeUnit is set to s, this parameter can only be set to 3600, indicating a pay-as-you-go instance.</li><li>When TimeUnit is set to m, the value set for this parameter indicates the subscription duration of the instance. For example, 1 indicates a one-month subscription.</li>
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * <p>Time unit for purchasing instances. Valid values:</p><li>s: indicates seconds. When PayMode is set to 0, TimeUnit can only be set to s.</li><li>m: indicates months. When PayMode is set to 1, TimeUnit can only be set to m.</li>
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * <p>Instance login settings. This parameter is used to set the login method for the purchased node, either the password or key.</p><li>When a key is set, the password is only used to log in to the native WebUI shortcut entry for the component.</li><li>When no key is set, the password is used to log in to the purchased node as well as the native WebUI shortcut entry for the component.</li>
    */
    @SerializedName("LoginSettings")
    @Expose
    private LoginSettings LoginSettings;

    /**
    * <p>VPC-related information configuration. This parameter can be used to specify the VPC ID, subnet ID, and so on.</p>
    */
    @SerializedName("VPCSettings")
    @Expose
    private VPCSettings VPCSettings;

    /**
    * <p>Node resource specifications.</p>
    */
    @SerializedName("ResourceSpec")
    @Expose
    private NewResourceSpec ResourceSpec;

    /**
    * <p>Specifies the parameters to be set for enabling COS access.</p>
    */
    @SerializedName("COSSettings")
    @Expose
    private COSSettings COSSettings;

    /**
    * <p>Location of the instance. This parameter can be used to specify attributes such as the AZ and associated project of the instance.</p>
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * <p>ID of the security group to which the instance belongs, for example, sg-xxxxxxxx. This parameter can be obtained by calling the SecurityGroupId field in the response result of <a href="https://www.tencentcloud.com/document/api/215/15808?from_cn_redirect=1">DescribeSecurityGroups</a>.</p>
    */
    @SerializedName("SgId")
    @Expose
    private String SgId;

    /**
    * <p><a href="https://www.tencentcloud.com/document/product/589/35656?from_cn_redirect=1">Bootstrap operation</a> script settings.</p>
    */
    @SerializedName("PreExecutedFileSettings")
    @Expose
    private PreExecuteFileSettings [] PreExecutedFileSettings;

    /**
    * <p>Whether a yearly/monthly subscription instance is automatically renewed. Valid values:</p><li>0: no</li><li>1: yes</li>
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long AutoRenew;

    /**
    * <p>Unique random identifier, which is valid for five minutes and needs to be specified by the caller. This prevents the client from repeatedly creating resources. Example value: a9a90aa6-<strong><strong>-</strong></strong>-****-fae36063280.</p>
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * <p>Whether to enable public network access for the cluster Master node. Valid values:</p><li>NEED_MASTER_WAN: yes</li><li>NOT_NEED_MASTER_WAN: no</li>By default, public network access is enabled for the cluster Master node.
    */
    @SerializedName("NeedMasterWan")
    @Expose
    private String NeedMasterWan;

    /**
    * <p>Whether to enable remote public network login, that is, port 22. If SgId is passed, this parameter is invalid.</p>
    */
    @SerializedName("RemoteLoginAtCreate")
    @Expose
    private Long RemoteLoginAtCreate;

    /**
    * <p>Whether the security cluster is enabled. Valid values: 0 (no) and values other than 0 (yes).</p>
    */
    @SerializedName("CheckSecurity")
    @Expose
    private Long CheckSecurity;

    /**
    * <p>Specifies the external file system to be accessed.</p>
    */
    @SerializedName("ExtendFsField")
    @Expose
    private String ExtendFsField;

    /**
    * <p>List of tag descriptions. When this parameter is specified, tags are bound to the corresponding instance.</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>List of dispersed placement group IDs. Currently, only one ID can be specified.<br>This parameter can be obtained by calling the SecurityGroupId field in the response result of <a href="https://www.tencentcloud.com/document/product/213/15486?from_cn_redirect=1">DescribeSecurityGroups</a>.</p>
    */
    @SerializedName("DisasterRecoverGroupIds")
    @Expose
    private String [] DisasterRecoverGroupIds;

    /**
    * <p>CBS encryption disk at the cluster level. Valid values: 0 (not encrypted) and 1 (encrypted). Default value: 0.</p>
    */
    @SerializedName("CbsEncrypt")
    @Expose
    private Long CbsEncrypt;

    /**
    * <p>Hive shared metadata database type. Valid values:</p><li>EMR_DEFAULT_META: created by the cluster by default</li><li>EMR_EXIST_META: EMR-MetaDB specified by the cluster</li><li>USER_CUSTOM_META: custom MetaDB used by the cluster</li>
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
    * <p>Custom application role.</p>
    */
    @SerializedName("ApplicationRole")
    @Expose
    private String ApplicationRole;

    /**
    * <p>Scenario-based values:<br>Hadoop-Kudu<br>Hadoop-Zookeeper<br>Hadoop-Presto<br>Hadoop-Hbase</p>
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
    * <p>If this parameter is set to 0, MultiZone, MultiDeployStrategy, and MultiZoneSettings are disabled. If this parameter is set to 1, ResourceSpec is deprecated and MultiZoneSettings is used.</p>
    */
    @SerializedName("VersionID")
    @Expose
    private Long VersionID;

    /**
    * <p>true: indicates that cross-AZ deployment is enabled. It is only a user parameter for cluster creation and cannot be adjusted subsequently.</p>
    */
    @SerializedName("MultiZone")
    @Expose
    private Boolean MultiZone;

    /**
    * <p>Specifications of node resources. Set one for each AZ. The first is the primary AZ, the second is the secondary AZ, and the third is the arbitration AZ. If cross-AZ is disabled, the length only needs to be 1.</p>
    */
    @SerializedName("MultiZoneSettings")
    @Expose
    private MultiZoneSetting [] MultiZoneSettings;

    /**
    * <p>COS bucket path, which is used when a StarRocks compute-storage separation cluster is created.</p>
    */
    @SerializedName("CosBucket")
    @Expose
    private String CosBucket;

    /**
    * <p>Node flag information, which is currently only provided for the Terraform platform.</p>
    */
    @SerializedName("NodeMarks")
    @Expose
    private NodeMark [] NodeMarks;

    /**
    * <p>CLB id</p>
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * <p>Database type. Valid values: mysql8/tdsql8.</p>
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
    * <p>Source IP address, which is specified in the security group.</p>
    */
    @SerializedName("SgIP")
    @Expose
    private String SgIP;

    /**
    * <p>Partition of a partition placement group.</p>
    */
    @SerializedName("PartitionNumber")
    @Expose
    private Long PartitionNumber;

    /**
    * <p>Service UI address.</p><p>Enumeration values:</p><ul><li>0: Service UI address. Only one service UI address is returned.</li><li>1: Service UI address. If the service has multiple UI addresses, all results are returned, such as Impalad, StateStore, and Catalogd of Impala.</li></ul><p>Default value: 0.</p>
    */
    @SerializedName("WebUiVersion")
    @Expose
    private Long WebUiVersion;

    /**
    * <p>Whether to enable cluster-level CBS system disk encryption. Valid values: 0 (no) and 1 (yes).</p>
    */
    @SerializedName("CbsSysEncrypt")
    @Expose
    private Long CbsSysEncrypt;

    /**
     * Get <p>Product ID. Different product IDs indicate different EMR product versions. Valid values:<br>51: STARROCKS-V1.4.0<br>54: STARROCKS-V2.0.0<br>27: KAFKA-V1.0.0<br>50: KAFKA-V2.0.0<br>16: EMR-V2.3.0<br>20: EMR-V2.5.0<br>30: EMR-V2.6.0<br>38: EMR-V2.7.0<br>25: EMR-V3.1.0<br>33: EMR-V3.2.1<br>34: EMR-V3.3.0<br>37: EMR-V3.4.0<br>44: EMR-V3.5.0<br>53: EMR-V3.6.0<br>58: EMR-3.6.1<br>59: EMR-serverless-1.0.0<br>60: EMR-TKE-1.1.0<br>61: SR-V2.1.0<br>62: SR-V2.1.0-SharedData<br>63: SR-V2.1.0.tlinux<br>64: unified metadata management project<br>65: EMR-TKE-AI-1.0.0<br>66: RSS-1.0.0<br>67: SR-V2.2.0<br>68: SR-V2.2.0.tlinux<br>69: EMR-AI-1.1.0<br>70: SR-V2.2.1<br>71: EMR-3.7.0<br>72: EMR-serverless-1.0.1<br>73: KAFKA-2.0.1<br>74: SR-V2.2.2<br>75: EMR-TKE-AI-1.1.0<br>76: EMR-V3.7.1<br>77: SERVERLESS-TCBASE-1.0.0<br>78: EMR-V3.6.2<br>79: STARROCKS-V2.2.2<br>80: EMR-AI-V1.1.1</p> 
     * @return ProductId <p>Product ID. Different product IDs indicate different EMR product versions. Valid values:<br>51: STARROCKS-V1.4.0<br>54: STARROCKS-V2.0.0<br>27: KAFKA-V1.0.0<br>50: KAFKA-V2.0.0<br>16: EMR-V2.3.0<br>20: EMR-V2.5.0<br>30: EMR-V2.6.0<br>38: EMR-V2.7.0<br>25: EMR-V3.1.0<br>33: EMR-V3.2.1<br>34: EMR-V3.3.0<br>37: EMR-V3.4.0<br>44: EMR-V3.5.0<br>53: EMR-V3.6.0<br>58: EMR-3.6.1<br>59: EMR-serverless-1.0.0<br>60: EMR-TKE-1.1.0<br>61: SR-V2.1.0<br>62: SR-V2.1.0-SharedData<br>63: SR-V2.1.0.tlinux<br>64: unified metadata management project<br>65: EMR-TKE-AI-1.0.0<br>66: RSS-1.0.0<br>67: SR-V2.2.0<br>68: SR-V2.2.0.tlinux<br>69: EMR-AI-1.1.0<br>70: SR-V2.2.1<br>71: EMR-3.7.0<br>72: EMR-serverless-1.0.1<br>73: KAFKA-2.0.1<br>74: SR-V2.2.2<br>75: EMR-TKE-AI-1.1.0<br>76: EMR-V3.7.1<br>77: SERVERLESS-TCBASE-1.0.0<br>78: EMR-V3.6.2<br>79: STARROCKS-V2.2.2<br>80: EMR-AI-V1.1.1</p>
     */
    public Long getProductId() {
        return this.ProductId;
    }

    /**
     * Set <p>Product ID. Different product IDs indicate different EMR product versions. Valid values:<br>51: STARROCKS-V1.4.0<br>54: STARROCKS-V2.0.0<br>27: KAFKA-V1.0.0<br>50: KAFKA-V2.0.0<br>16: EMR-V2.3.0<br>20: EMR-V2.5.0<br>30: EMR-V2.6.0<br>38: EMR-V2.7.0<br>25: EMR-V3.1.0<br>33: EMR-V3.2.1<br>34: EMR-V3.3.0<br>37: EMR-V3.4.0<br>44: EMR-V3.5.0<br>53: EMR-V3.6.0<br>58: EMR-3.6.1<br>59: EMR-serverless-1.0.0<br>60: EMR-TKE-1.1.0<br>61: SR-V2.1.0<br>62: SR-V2.1.0-SharedData<br>63: SR-V2.1.0.tlinux<br>64: unified metadata management project<br>65: EMR-TKE-AI-1.0.0<br>66: RSS-1.0.0<br>67: SR-V2.2.0<br>68: SR-V2.2.0.tlinux<br>69: EMR-AI-1.1.0<br>70: SR-V2.2.1<br>71: EMR-3.7.0<br>72: EMR-serverless-1.0.1<br>73: KAFKA-2.0.1<br>74: SR-V2.2.2<br>75: EMR-TKE-AI-1.1.0<br>76: EMR-V3.7.1<br>77: SERVERLESS-TCBASE-1.0.0<br>78: EMR-V3.6.2<br>79: STARROCKS-V2.2.2<br>80: EMR-AI-V1.1.1</p>
     * @param ProductId <p>Product ID. Different product IDs indicate different EMR product versions. Valid values:<br>51: STARROCKS-V1.4.0<br>54: STARROCKS-V2.0.0<br>27: KAFKA-V1.0.0<br>50: KAFKA-V2.0.0<br>16: EMR-V2.3.0<br>20: EMR-V2.5.0<br>30: EMR-V2.6.0<br>38: EMR-V2.7.0<br>25: EMR-V3.1.0<br>33: EMR-V3.2.1<br>34: EMR-V3.3.0<br>37: EMR-V3.4.0<br>44: EMR-V3.5.0<br>53: EMR-V3.6.0<br>58: EMR-3.6.1<br>59: EMR-serverless-1.0.0<br>60: EMR-TKE-1.1.0<br>61: SR-V2.1.0<br>62: SR-V2.1.0-SharedData<br>63: SR-V2.1.0.tlinux<br>64: unified metadata management project<br>65: EMR-TKE-AI-1.0.0<br>66: RSS-1.0.0<br>67: SR-V2.2.0<br>68: SR-V2.2.0.tlinux<br>69: EMR-AI-1.1.0<br>70: SR-V2.2.1<br>71: EMR-3.7.0<br>72: EMR-serverless-1.0.1<br>73: KAFKA-2.0.1<br>74: SR-V2.2.2<br>75: EMR-TKE-AI-1.1.0<br>76: EMR-V3.7.1<br>77: SERVERLESS-TCBASE-1.0.0<br>78: EMR-V3.6.2<br>79: STARROCKS-V2.2.2<br>80: EMR-AI-V1.1.1</p>
     */
    public void setProductId(Long ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get <p>List of deployed components. Different EMR product IDs correspond to different optional component lists (ProductId: For details about its meaning, see the ProductId request parameter). For details about how to query optional component lists for different product versions, see <a href="https://www.tencentcloud.com/document/product/589/20279?from_cn_redirect=1">Component Version</a>.<br>Example values: hive and flink.</p> 
     * @return Software <p>List of deployed components. Different EMR product IDs correspond to different optional component lists (ProductId: For details about its meaning, see the ProductId request parameter). For details about how to query optional component lists for different product versions, see <a href="https://www.tencentcloud.com/document/product/589/20279?from_cn_redirect=1">Component Version</a>.<br>Example values: hive and flink.</p>
     */
    public String [] getSoftware() {
        return this.Software;
    }

    /**
     * Set <p>List of deployed components. Different EMR product IDs correspond to different optional component lists (ProductId: For details about its meaning, see the ProductId request parameter). For details about how to query optional component lists for different product versions, see <a href="https://www.tencentcloud.com/document/product/589/20279?from_cn_redirect=1">Component Version</a>.<br>Example values: hive and flink.</p>
     * @param Software <p>List of deployed components. Different EMR product IDs correspond to different optional component lists (ProductId: For details about its meaning, see the ProductId request parameter). For details about how to query optional component lists for different product versions, see <a href="https://www.tencentcloud.com/document/product/589/20279?from_cn_redirect=1">Component Version</a>.<br>Example values: hive and flink.</p>
     */
    public void setSoftware(String [] Software) {
        this.Software = Software;
    }

    /**
     * Get <p>Whether to enable high availability for the node. Valid values:</p><li>0: disables high availability for the node.</li><li>1: enables high availability for the node.</li> 
     * @return SupportHA <p>Whether to enable high availability for the node. Valid values:</p><li>0: disables high availability for the node.</li><li>1: enables high availability for the node.</li>
     */
    public Long getSupportHA() {
        return this.SupportHA;
    }

    /**
     * Set <p>Whether to enable high availability for the node. Valid values:</p><li>0: disables high availability for the node.</li><li>1: enables high availability for the node.</li>
     * @param SupportHA <p>Whether to enable high availability for the node. Valid values:</p><li>0: disables high availability for the node.</li><li>1: enables high availability for the node.</li>
     */
    public void setSupportHA(Long SupportHA) {
        this.SupportHA = SupportHA;
    }

    /**
     * Get <p>Instance name.</p><li>The value can contain 6 to 36 characters.</li><li>Only Chinese characters, letters, digits, hyphens (-), and underscores (_) are allowed.</li> 
     * @return InstanceName <p>Instance name.</p><li>The value can contain 6 to 36 characters.</li><li>Only Chinese characters, letters, digits, hyphens (-), and underscores (_) are allowed.</li>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>Instance name.</p><li>The value can contain 6 to 36 characters.</li><li>Only Chinese characters, letters, digits, hyphens (-), and underscores (_) are allowed.</li>
     * @param InstanceName <p>Instance name.</p><li>The value can contain 6 to 36 characters.</li><li>Only Chinese characters, letters, digits, hyphens (-), and underscores (_) are allowed.</li>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
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
     * Get <p>Instance login settings. This parameter is used to set the login method for the purchased node, either the password or key.</p><li>When a key is set, the password is only used to log in to the native WebUI shortcut entry for the component.</li><li>When no key is set, the password is used to log in to the purchased node as well as the native WebUI shortcut entry for the component.</li> 
     * @return LoginSettings <p>Instance login settings. This parameter is used to set the login method for the purchased node, either the password or key.</p><li>When a key is set, the password is only used to log in to the native WebUI shortcut entry for the component.</li><li>When no key is set, the password is used to log in to the purchased node as well as the native WebUI shortcut entry for the component.</li>
     */
    public LoginSettings getLoginSettings() {
        return this.LoginSettings;
    }

    /**
     * Set <p>Instance login settings. This parameter is used to set the login method for the purchased node, either the password or key.</p><li>When a key is set, the password is only used to log in to the native WebUI shortcut entry for the component.</li><li>When no key is set, the password is used to log in to the purchased node as well as the native WebUI shortcut entry for the component.</li>
     * @param LoginSettings <p>Instance login settings. This parameter is used to set the login method for the purchased node, either the password or key.</p><li>When a key is set, the password is only used to log in to the native WebUI shortcut entry for the component.</li><li>When no key is set, the password is used to log in to the purchased node as well as the native WebUI shortcut entry for the component.</li>
     */
    public void setLoginSettings(LoginSettings LoginSettings) {
        this.LoginSettings = LoginSettings;
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
     * Get <p>Node resource specifications.</p> 
     * @return ResourceSpec <p>Node resource specifications.</p>
     */
    public NewResourceSpec getResourceSpec() {
        return this.ResourceSpec;
    }

    /**
     * Set <p>Node resource specifications.</p>
     * @param ResourceSpec <p>Node resource specifications.</p>
     */
    public void setResourceSpec(NewResourceSpec ResourceSpec) {
        this.ResourceSpec = ResourceSpec;
    }

    /**
     * Get <p>Specifies the parameters to be set for enabling COS access.</p> 
     * @return COSSettings <p>Specifies the parameters to be set for enabling COS access.</p>
     */
    public COSSettings getCOSSettings() {
        return this.COSSettings;
    }

    /**
     * Set <p>Specifies the parameters to be set for enabling COS access.</p>
     * @param COSSettings <p>Specifies the parameters to be set for enabling COS access.</p>
     */
    public void setCOSSettings(COSSettings COSSettings) {
        this.COSSettings = COSSettings;
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
     * Get <p>ID of the security group to which the instance belongs, for example, sg-xxxxxxxx. This parameter can be obtained by calling the SecurityGroupId field in the response result of <a href="https://www.tencentcloud.com/document/api/215/15808?from_cn_redirect=1">DescribeSecurityGroups</a>.</p> 
     * @return SgId <p>ID of the security group to which the instance belongs, for example, sg-xxxxxxxx. This parameter can be obtained by calling the SecurityGroupId field in the response result of <a href="https://www.tencentcloud.com/document/api/215/15808?from_cn_redirect=1">DescribeSecurityGroups</a>.</p>
     */
    public String getSgId() {
        return this.SgId;
    }

    /**
     * Set <p>ID of the security group to which the instance belongs, for example, sg-xxxxxxxx. This parameter can be obtained by calling the SecurityGroupId field in the response result of <a href="https://www.tencentcloud.com/document/api/215/15808?from_cn_redirect=1">DescribeSecurityGroups</a>.</p>
     * @param SgId <p>ID of the security group to which the instance belongs, for example, sg-xxxxxxxx. This parameter can be obtained by calling the SecurityGroupId field in the response result of <a href="https://www.tencentcloud.com/document/api/215/15808?from_cn_redirect=1">DescribeSecurityGroups</a>.</p>
     */
    public void setSgId(String SgId) {
        this.SgId = SgId;
    }

    /**
     * Get <p><a href="https://www.tencentcloud.com/document/product/589/35656?from_cn_redirect=1">Bootstrap operation</a> script settings.</p> 
     * @return PreExecutedFileSettings <p><a href="https://www.tencentcloud.com/document/product/589/35656?from_cn_redirect=1">Bootstrap operation</a> script settings.</p>
     */
    public PreExecuteFileSettings [] getPreExecutedFileSettings() {
        return this.PreExecutedFileSettings;
    }

    /**
     * Set <p><a href="https://www.tencentcloud.com/document/product/589/35656?from_cn_redirect=1">Bootstrap operation</a> script settings.</p>
     * @param PreExecutedFileSettings <p><a href="https://www.tencentcloud.com/document/product/589/35656?from_cn_redirect=1">Bootstrap operation</a> script settings.</p>
     */
    public void setPreExecutedFileSettings(PreExecuteFileSettings [] PreExecutedFileSettings) {
        this.PreExecutedFileSettings = PreExecutedFileSettings;
    }

    /**
     * Get <p>Whether a yearly/monthly subscription instance is automatically renewed. Valid values:</p><li>0: no</li><li>1: yes</li> 
     * @return AutoRenew <p>Whether a yearly/monthly subscription instance is automatically renewed. Valid values:</p><li>0: no</li><li>1: yes</li>
     */
    public Long getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set <p>Whether a yearly/monthly subscription instance is automatically renewed. Valid values:</p><li>0: no</li><li>1: yes</li>
     * @param AutoRenew <p>Whether a yearly/monthly subscription instance is automatically renewed. Valid values:</p><li>0: no</li><li>1: yes</li>
     */
    public void setAutoRenew(Long AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * Get <p>Unique random identifier, which is valid for five minutes and needs to be specified by the caller. This prevents the client from repeatedly creating resources. Example value: a9a90aa6-<strong><strong>-</strong></strong>-****-fae36063280.</p> 
     * @return ClientToken <p>Unique random identifier, which is valid for five minutes and needs to be specified by the caller. This prevents the client from repeatedly creating resources. Example value: a9a90aa6-<strong><strong>-</strong></strong>-****-fae36063280.</p>
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set <p>Unique random identifier, which is valid for five minutes and needs to be specified by the caller. This prevents the client from repeatedly creating resources. Example value: a9a90aa6-<strong><strong>-</strong></strong>-****-fae36063280.</p>
     * @param ClientToken <p>Unique random identifier, which is valid for five minutes and needs to be specified by the caller. This prevents the client from repeatedly creating resources. Example value: a9a90aa6-<strong><strong>-</strong></strong>-****-fae36063280.</p>
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get <p>Whether to enable public network access for the cluster Master node. Valid values:</p><li>NEED_MASTER_WAN: yes</li><li>NOT_NEED_MASTER_WAN: no</li>By default, public network access is enabled for the cluster Master node. 
     * @return NeedMasterWan <p>Whether to enable public network access for the cluster Master node. Valid values:</p><li>NEED_MASTER_WAN: yes</li><li>NOT_NEED_MASTER_WAN: no</li>By default, public network access is enabled for the cluster Master node.
     */
    public String getNeedMasterWan() {
        return this.NeedMasterWan;
    }

    /**
     * Set <p>Whether to enable public network access for the cluster Master node. Valid values:</p><li>NEED_MASTER_WAN: yes</li><li>NOT_NEED_MASTER_WAN: no</li>By default, public network access is enabled for the cluster Master node.
     * @param NeedMasterWan <p>Whether to enable public network access for the cluster Master node. Valid values:</p><li>NEED_MASTER_WAN: yes</li><li>NOT_NEED_MASTER_WAN: no</li>By default, public network access is enabled for the cluster Master node.
     */
    public void setNeedMasterWan(String NeedMasterWan) {
        this.NeedMasterWan = NeedMasterWan;
    }

    /**
     * Get <p>Whether to enable remote public network login, that is, port 22. If SgId is passed, this parameter is invalid.</p> 
     * @return RemoteLoginAtCreate <p>Whether to enable remote public network login, that is, port 22. If SgId is passed, this parameter is invalid.</p>
     */
    public Long getRemoteLoginAtCreate() {
        return this.RemoteLoginAtCreate;
    }

    /**
     * Set <p>Whether to enable remote public network login, that is, port 22. If SgId is passed, this parameter is invalid.</p>
     * @param RemoteLoginAtCreate <p>Whether to enable remote public network login, that is, port 22. If SgId is passed, this parameter is invalid.</p>
     */
    public void setRemoteLoginAtCreate(Long RemoteLoginAtCreate) {
        this.RemoteLoginAtCreate = RemoteLoginAtCreate;
    }

    /**
     * Get <p>Whether the security cluster is enabled. Valid values: 0 (no) and values other than 0 (yes).</p> 
     * @return CheckSecurity <p>Whether the security cluster is enabled. Valid values: 0 (no) and values other than 0 (yes).</p>
     */
    public Long getCheckSecurity() {
        return this.CheckSecurity;
    }

    /**
     * Set <p>Whether the security cluster is enabled. Valid values: 0 (no) and values other than 0 (yes).</p>
     * @param CheckSecurity <p>Whether the security cluster is enabled. Valid values: 0 (no) and values other than 0 (yes).</p>
     */
    public void setCheckSecurity(Long CheckSecurity) {
        this.CheckSecurity = CheckSecurity;
    }

    /**
     * Get <p>Specifies the external file system to be accessed.</p> 
     * @return ExtendFsField <p>Specifies the external file system to be accessed.</p>
     */
    public String getExtendFsField() {
        return this.ExtendFsField;
    }

    /**
     * Set <p>Specifies the external file system to be accessed.</p>
     * @param ExtendFsField <p>Specifies the external file system to be accessed.</p>
     */
    public void setExtendFsField(String ExtendFsField) {
        this.ExtendFsField = ExtendFsField;
    }

    /**
     * Get <p>List of tag descriptions. When this parameter is specified, tags are bound to the corresponding instance.</p> 
     * @return Tags <p>List of tag descriptions. When this parameter is specified, tags are bound to the corresponding instance.</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>List of tag descriptions. When this parameter is specified, tags are bound to the corresponding instance.</p>
     * @param Tags <p>List of tag descriptions. When this parameter is specified, tags are bound to the corresponding instance.</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>List of dispersed placement group IDs. Currently, only one ID can be specified.<br>This parameter can be obtained by calling the SecurityGroupId field in the response result of <a href="https://www.tencentcloud.com/document/product/213/15486?from_cn_redirect=1">DescribeSecurityGroups</a>.</p> 
     * @return DisasterRecoverGroupIds <p>List of dispersed placement group IDs. Currently, only one ID can be specified.<br>This parameter can be obtained by calling the SecurityGroupId field in the response result of <a href="https://www.tencentcloud.com/document/product/213/15486?from_cn_redirect=1">DescribeSecurityGroups</a>.</p>
     */
    public String [] getDisasterRecoverGroupIds() {
        return this.DisasterRecoverGroupIds;
    }

    /**
     * Set <p>List of dispersed placement group IDs. Currently, only one ID can be specified.<br>This parameter can be obtained by calling the SecurityGroupId field in the response result of <a href="https://www.tencentcloud.com/document/product/213/15486?from_cn_redirect=1">DescribeSecurityGroups</a>.</p>
     * @param DisasterRecoverGroupIds <p>List of dispersed placement group IDs. Currently, only one ID can be specified.<br>This parameter can be obtained by calling the SecurityGroupId field in the response result of <a href="https://www.tencentcloud.com/document/product/213/15486?from_cn_redirect=1">DescribeSecurityGroups</a>.</p>
     */
    public void setDisasterRecoverGroupIds(String [] DisasterRecoverGroupIds) {
        this.DisasterRecoverGroupIds = DisasterRecoverGroupIds;
    }

    /**
     * Get <p>CBS encryption disk at the cluster level. Valid values: 0 (not encrypted) and 1 (encrypted). Default value: 0.</p> 
     * @return CbsEncrypt <p>CBS encryption disk at the cluster level. Valid values: 0 (not encrypted) and 1 (encrypted). Default value: 0.</p>
     */
    public Long getCbsEncrypt() {
        return this.CbsEncrypt;
    }

    /**
     * Set <p>CBS encryption disk at the cluster level. Valid values: 0 (not encrypted) and 1 (encrypted). Default value: 0.</p>
     * @param CbsEncrypt <p>CBS encryption disk at the cluster level. Valid values: 0 (not encrypted) and 1 (encrypted). Default value: 0.</p>
     */
    public void setCbsEncrypt(Long CbsEncrypt) {
        this.CbsEncrypt = CbsEncrypt;
    }

    /**
     * Get <p>Hive shared metadata database type. Valid values:</p><li>EMR_DEFAULT_META: created by the cluster by default</li><li>EMR_EXIST_META: EMR-MetaDB specified by the cluster</li><li>USER_CUSTOM_META: custom MetaDB used by the cluster</li> 
     * @return MetaType <p>Hive shared metadata database type. Valid values:</p><li>EMR_DEFAULT_META: created by the cluster by default</li><li>EMR_EXIST_META: EMR-MetaDB specified by the cluster</li><li>USER_CUSTOM_META: custom MetaDB used by the cluster</li>
     */
    public String getMetaType() {
        return this.MetaType;
    }

    /**
     * Set <p>Hive shared metadata database type. Valid values:</p><li>EMR_DEFAULT_META: created by the cluster by default</li><li>EMR_EXIST_META: EMR-MetaDB specified by the cluster</li><li>USER_CUSTOM_META: custom MetaDB used by the cluster</li>
     * @param MetaType <p>Hive shared metadata database type. Valid values:</p><li>EMR_DEFAULT_META: created by the cluster by default</li><li>EMR_EXIST_META: EMR-MetaDB specified by the cluster</li><li>USER_CUSTOM_META: custom MetaDB used by the cluster</li>
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
     * Get <p>Custom application role.</p> 
     * @return ApplicationRole <p>Custom application role.</p>
     */
    public String getApplicationRole() {
        return this.ApplicationRole;
    }

    /**
     * Set <p>Custom application role.</p>
     * @param ApplicationRole <p>Custom application role.</p>
     */
    public void setApplicationRole(String ApplicationRole) {
        this.ApplicationRole = ApplicationRole;
    }

    /**
     * Get <p>Scenario-based values:<br>Hadoop-Kudu<br>Hadoop-Zookeeper<br>Hadoop-Presto<br>Hadoop-Hbase</p> 
     * @return SceneName <p>Scenario-based values:<br>Hadoop-Kudu<br>Hadoop-Zookeeper<br>Hadoop-Presto<br>Hadoop-Hbase</p>
     */
    public String getSceneName() {
        return this.SceneName;
    }

    /**
     * Set <p>Scenario-based values:<br>Hadoop-Kudu<br>Hadoop-Zookeeper<br>Hadoop-Presto<br>Hadoop-Hbase</p>
     * @param SceneName <p>Scenario-based values:<br>Hadoop-Kudu<br>Hadoop-Zookeeper<br>Hadoop-Presto<br>Hadoop-Hbase</p>
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
     * Get <p>If this parameter is set to 0, MultiZone, MultiDeployStrategy, and MultiZoneSettings are disabled. If this parameter is set to 1, ResourceSpec is deprecated and MultiZoneSettings is used.</p> 
     * @return VersionID <p>If this parameter is set to 0, MultiZone, MultiDeployStrategy, and MultiZoneSettings are disabled. If this parameter is set to 1, ResourceSpec is deprecated and MultiZoneSettings is used.</p>
     */
    public Long getVersionID() {
        return this.VersionID;
    }

    /**
     * Set <p>If this parameter is set to 0, MultiZone, MultiDeployStrategy, and MultiZoneSettings are disabled. If this parameter is set to 1, ResourceSpec is deprecated and MultiZoneSettings is used.</p>
     * @param VersionID <p>If this parameter is set to 0, MultiZone, MultiDeployStrategy, and MultiZoneSettings are disabled. If this parameter is set to 1, ResourceSpec is deprecated and MultiZoneSettings is used.</p>
     */
    public void setVersionID(Long VersionID) {
        this.VersionID = VersionID;
    }

    /**
     * Get <p>true: indicates that cross-AZ deployment is enabled. It is only a user parameter for cluster creation and cannot be adjusted subsequently.</p> 
     * @return MultiZone <p>true: indicates that cross-AZ deployment is enabled. It is only a user parameter for cluster creation and cannot be adjusted subsequently.</p>
     */
    public Boolean getMultiZone() {
        return this.MultiZone;
    }

    /**
     * Set <p>true: indicates that cross-AZ deployment is enabled. It is only a user parameter for cluster creation and cannot be adjusted subsequently.</p>
     * @param MultiZone <p>true: indicates that cross-AZ deployment is enabled. It is only a user parameter for cluster creation and cannot be adjusted subsequently.</p>
     */
    public void setMultiZone(Boolean MultiZone) {
        this.MultiZone = MultiZone;
    }

    /**
     * Get <p>Specifications of node resources. Set one for each AZ. The first is the primary AZ, the second is the secondary AZ, and the third is the arbitration AZ. If cross-AZ is disabled, the length only needs to be 1.</p> 
     * @return MultiZoneSettings <p>Specifications of node resources. Set one for each AZ. The first is the primary AZ, the second is the secondary AZ, and the third is the arbitration AZ. If cross-AZ is disabled, the length only needs to be 1.</p>
     */
    public MultiZoneSetting [] getMultiZoneSettings() {
        return this.MultiZoneSettings;
    }

    /**
     * Set <p>Specifications of node resources. Set one for each AZ. The first is the primary AZ, the second is the secondary AZ, and the third is the arbitration AZ. If cross-AZ is disabled, the length only needs to be 1.</p>
     * @param MultiZoneSettings <p>Specifications of node resources. Set one for each AZ. The first is the primary AZ, the second is the secondary AZ, and the third is the arbitration AZ. If cross-AZ is disabled, the length only needs to be 1.</p>
     */
    public void setMultiZoneSettings(MultiZoneSetting [] MultiZoneSettings) {
        this.MultiZoneSettings = MultiZoneSettings;
    }

    /**
     * Get <p>COS bucket path, which is used when a StarRocks compute-storage separation cluster is created.</p> 
     * @return CosBucket <p>COS bucket path, which is used when a StarRocks compute-storage separation cluster is created.</p>
     */
    public String getCosBucket() {
        return this.CosBucket;
    }

    /**
     * Set <p>COS bucket path, which is used when a StarRocks compute-storage separation cluster is created.</p>
     * @param CosBucket <p>COS bucket path, which is used when a StarRocks compute-storage separation cluster is created.</p>
     */
    public void setCosBucket(String CosBucket) {
        this.CosBucket = CosBucket;
    }

    /**
     * Get <p>Node flag information, which is currently only provided for the Terraform platform.</p> 
     * @return NodeMarks <p>Node flag information, which is currently only provided for the Terraform platform.</p>
     */
    public NodeMark [] getNodeMarks() {
        return this.NodeMarks;
    }

    /**
     * Set <p>Node flag information, which is currently only provided for the Terraform platform.</p>
     * @param NodeMarks <p>Node flag information, which is currently only provided for the Terraform platform.</p>
     */
    public void setNodeMarks(NodeMark [] NodeMarks) {
        this.NodeMarks = NodeMarks;
    }

    /**
     * Get <p>CLB id</p> 
     * @return LoadBalancerId <p>CLB id</p>
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set <p>CLB id</p>
     * @param LoadBalancerId <p>CLB id</p>
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get <p>Database type. Valid values: mysql8/tdsql8.</p> 
     * @return DefaultMetaVersion <p>Database type. Valid values: mysql8/tdsql8.</p>
     */
    public String getDefaultMetaVersion() {
        return this.DefaultMetaVersion;
    }

    /**
     * Set <p>Database type. Valid values: mysql8/tdsql8.</p>
     * @param DefaultMetaVersion <p>Database type. Valid values: mysql8/tdsql8.</p>
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
     * Get <p>Source IP address, which is specified in the security group.</p> 
     * @return SgIP <p>Source IP address, which is specified in the security group.</p>
     */
    public String getSgIP() {
        return this.SgIP;
    }

    /**
     * Set <p>Source IP address, which is specified in the security group.</p>
     * @param SgIP <p>Source IP address, which is specified in the security group.</p>
     */
    public void setSgIP(String SgIP) {
        this.SgIP = SgIP;
    }

    /**
     * Get <p>Partition of a partition placement group.</p> 
     * @return PartitionNumber <p>Partition of a partition placement group.</p>
     */
    public Long getPartitionNumber() {
        return this.PartitionNumber;
    }

    /**
     * Set <p>Partition of a partition placement group.</p>
     * @param PartitionNumber <p>Partition of a partition placement group.</p>
     */
    public void setPartitionNumber(Long PartitionNumber) {
        this.PartitionNumber = PartitionNumber;
    }

    /**
     * Get <p>Service UI address.</p><p>Enumeration values:</p><ul><li>0: Service UI address. Only one service UI address is returned.</li><li>1: Service UI address. If the service has multiple UI addresses, all results are returned, such as Impalad, StateStore, and Catalogd of Impala.</li></ul><p>Default value: 0.</p> 
     * @return WebUiVersion <p>Service UI address.</p><p>Enumeration values:</p><ul><li>0: Service UI address. Only one service UI address is returned.</li><li>1: Service UI address. If the service has multiple UI addresses, all results are returned, such as Impalad, StateStore, and Catalogd of Impala.</li></ul><p>Default value: 0.</p>
     */
    public Long getWebUiVersion() {
        return this.WebUiVersion;
    }

    /**
     * Set <p>Service UI address.</p><p>Enumeration values:</p><ul><li>0: Service UI address. Only one service UI address is returned.</li><li>1: Service UI address. If the service has multiple UI addresses, all results are returned, such as Impalad, StateStore, and Catalogd of Impala.</li></ul><p>Default value: 0.</p>
     * @param WebUiVersion <p>Service UI address.</p><p>Enumeration values:</p><ul><li>0: Service UI address. Only one service UI address is returned.</li><li>1: Service UI address. If the service has multiple UI addresses, all results are returned, such as Impalad, StateStore, and Catalogd of Impala.</li></ul><p>Default value: 0.</p>
     */
    public void setWebUiVersion(Long WebUiVersion) {
        this.WebUiVersion = WebUiVersion;
    }

    /**
     * Get <p>Whether to enable cluster-level CBS system disk encryption. Valid values: 0 (no) and 1 (yes).</p> 
     * @return CbsSysEncrypt <p>Whether to enable cluster-level CBS system disk encryption. Valid values: 0 (no) and 1 (yes).</p>
     */
    public Long getCbsSysEncrypt() {
        return this.CbsSysEncrypt;
    }

    /**
     * Set <p>Whether to enable cluster-level CBS system disk encryption. Valid values: 0 (no) and 1 (yes).</p>
     * @param CbsSysEncrypt <p>Whether to enable cluster-level CBS system disk encryption. Valid values: 0 (no) and 1 (yes).</p>
     */
    public void setCbsSysEncrypt(Long CbsSysEncrypt) {
        this.CbsSysEncrypt = CbsSysEncrypt;
    }

    public CreateInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInstanceRequest(CreateInstanceRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new Long(source.ProductId);
        }
        if (source.Software != null) {
            this.Software = new String[source.Software.length];
            for (int i = 0; i < source.Software.length; i++) {
                this.Software[i] = new String(source.Software[i]);
            }
        }
        if (source.SupportHA != null) {
            this.SupportHA = new Long(source.SupportHA);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.LoginSettings != null) {
            this.LoginSettings = new LoginSettings(source.LoginSettings);
        }
        if (source.VPCSettings != null) {
            this.VPCSettings = new VPCSettings(source.VPCSettings);
        }
        if (source.ResourceSpec != null) {
            this.ResourceSpec = new NewResourceSpec(source.ResourceSpec);
        }
        if (source.COSSettings != null) {
            this.COSSettings = new COSSettings(source.COSSettings);
        }
        if (source.Placement != null) {
            this.Placement = new Placement(source.Placement);
        }
        if (source.SgId != null) {
            this.SgId = new String(source.SgId);
        }
        if (source.PreExecutedFileSettings != null) {
            this.PreExecutedFileSettings = new PreExecuteFileSettings[source.PreExecutedFileSettings.length];
            for (int i = 0; i < source.PreExecutedFileSettings.length; i++) {
                this.PreExecutedFileSettings[i] = new PreExecuteFileSettings(source.PreExecutedFileSettings[i]);
            }
        }
        if (source.AutoRenew != null) {
            this.AutoRenew = new Long(source.AutoRenew);
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
        if (source.NeedMasterWan != null) {
            this.NeedMasterWan = new String(source.NeedMasterWan);
        }
        if (source.RemoteLoginAtCreate != null) {
            this.RemoteLoginAtCreate = new Long(source.RemoteLoginAtCreate);
        }
        if (source.CheckSecurity != null) {
            this.CheckSecurity = new Long(source.CheckSecurity);
        }
        if (source.ExtendFsField != null) {
            this.ExtendFsField = new String(source.ExtendFsField);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.DisasterRecoverGroupIds != null) {
            this.DisasterRecoverGroupIds = new String[source.DisasterRecoverGroupIds.length];
            for (int i = 0; i < source.DisasterRecoverGroupIds.length; i++) {
                this.DisasterRecoverGroupIds[i] = new String(source.DisasterRecoverGroupIds[i]);
            }
        }
        if (source.CbsEncrypt != null) {
            this.CbsEncrypt = new Long(source.CbsEncrypt);
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
        if (source.ApplicationRole != null) {
            this.ApplicationRole = new String(source.ApplicationRole);
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
        if (source.MultiZone != null) {
            this.MultiZone = new Boolean(source.MultiZone);
        }
        if (source.MultiZoneSettings != null) {
            this.MultiZoneSettings = new MultiZoneSetting[source.MultiZoneSettings.length];
            for (int i = 0; i < source.MultiZoneSettings.length; i++) {
                this.MultiZoneSettings[i] = new MultiZoneSetting(source.MultiZoneSettings[i]);
            }
        }
        if (source.CosBucket != null) {
            this.CosBucket = new String(source.CosBucket);
        }
        if (source.NodeMarks != null) {
            this.NodeMarks = new NodeMark[source.NodeMarks.length];
            for (int i = 0; i < source.NodeMarks.length; i++) {
                this.NodeMarks[i] = new NodeMark(source.NodeMarks[i]);
            }
        }
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.DefaultMetaVersion != null) {
            this.DefaultMetaVersion = new String(source.DefaultMetaVersion);
        }
        if (source.NeedCdbAudit != null) {
            this.NeedCdbAudit = new Long(source.NeedCdbAudit);
        }
        if (source.SgIP != null) {
            this.SgIP = new String(source.SgIP);
        }
        if (source.PartitionNumber != null) {
            this.PartitionNumber = new Long(source.PartitionNumber);
        }
        if (source.WebUiVersion != null) {
            this.WebUiVersion = new Long(source.WebUiVersion);
        }
        if (source.CbsSysEncrypt != null) {
            this.CbsSysEncrypt = new Long(source.CbsSysEncrypt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamArraySimple(map, prefix + "Software.", this.Software);
        this.setParamSimple(map, prefix + "SupportHA", this.SupportHA);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamObj(map, prefix + "LoginSettings.", this.LoginSettings);
        this.setParamObj(map, prefix + "VPCSettings.", this.VPCSettings);
        this.setParamObj(map, prefix + "ResourceSpec.", this.ResourceSpec);
        this.setParamObj(map, prefix + "COSSettings.", this.COSSettings);
        this.setParamObj(map, prefix + "Placement.", this.Placement);
        this.setParamSimple(map, prefix + "SgId", this.SgId);
        this.setParamArrayObj(map, prefix + "PreExecutedFileSettings.", this.PreExecutedFileSettings);
        this.setParamSimple(map, prefix + "AutoRenew", this.AutoRenew);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamSimple(map, prefix + "NeedMasterWan", this.NeedMasterWan);
        this.setParamSimple(map, prefix + "RemoteLoginAtCreate", this.RemoteLoginAtCreate);
        this.setParamSimple(map, prefix + "CheckSecurity", this.CheckSecurity);
        this.setParamSimple(map, prefix + "ExtendFsField", this.ExtendFsField);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArraySimple(map, prefix + "DisasterRecoverGroupIds.", this.DisasterRecoverGroupIds);
        this.setParamSimple(map, prefix + "CbsEncrypt", this.CbsEncrypt);
        this.setParamSimple(map, prefix + "MetaType", this.MetaType);
        this.setParamSimple(map, prefix + "UnifyMetaInstanceId", this.UnifyMetaInstanceId);
        this.setParamObj(map, prefix + "MetaDBInfo.", this.MetaDBInfo);
        this.setParamSimple(map, prefix + "ApplicationRole", this.ApplicationRole);
        this.setParamSimple(map, prefix + "SceneName", this.SceneName);
        this.setParamArrayObj(map, prefix + "ExternalService.", this.ExternalService);
        this.setParamSimple(map, prefix + "VersionID", this.VersionID);
        this.setParamSimple(map, prefix + "MultiZone", this.MultiZone);
        this.setParamArrayObj(map, prefix + "MultiZoneSettings.", this.MultiZoneSettings);
        this.setParamSimple(map, prefix + "CosBucket", this.CosBucket);
        this.setParamArrayObj(map, prefix + "NodeMarks.", this.NodeMarks);
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "DefaultMetaVersion", this.DefaultMetaVersion);
        this.setParamSimple(map, prefix + "NeedCdbAudit", this.NeedCdbAudit);
        this.setParamSimple(map, prefix + "SgIP", this.SgIP);
        this.setParamSimple(map, prefix + "PartitionNumber", this.PartitionNumber);
        this.setParamSimple(map, prefix + "WebUiVersion", this.WebUiVersion);
        this.setParamSimple(map, prefix + "CbsSysEncrypt", this.CbsSysEncrypt);

    }
}

