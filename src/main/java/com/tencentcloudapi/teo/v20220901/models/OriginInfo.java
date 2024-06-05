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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OriginInfo extends AbstractModel {

    /**
    * The origin server type, with values:
<li>IP_DOMAIN: IPv4, IPv6, or domain name type origin server;</li>
<li>COS: Tencent Cloud COS origin server;</li>
<li>AWS_S3: AWS S3 origin server;</li>
<li>ORIGIN_GROUP: origin server group type origin server;</li>
<li>VODEO: VOD on EO;</li>
<li>SPACE: origin server uninstallation. Currently only available to the allowlist;</li>
<li>LB: load balancing. Currently only available to the allowlist. </li>
    */
    @SerializedName("OriginType")
    @Expose
    private String OriginType;

    /**
    * Origin server address, varying depending on the value of OriginType:
<li>When OriginType is IP_DOMAIN, specify this parameter with IPv4, IPv6, or domain name;</li>
<li>When OriginType is COS, specify this parameter with the COS bucket access domain name;</li>
<li>When OriginType is AWS_S3, specify this parameter with the S3 bucket access domain name;</li>
<li>When OriginType is ORIGIN_GROUP, specify this parameter with the origin group ID;</li>
<li>When OriginType is VODEO and VodeoDistributionRange is ALL, specify this parameter with "all-buckets-in-vodeo-application"; if VodeoDistributionRange is Bucket, specify this parameter with the corresponding storage bucket domain name;</li>
<li>When OriginType is LB, specify the Cloud Load Balancer instance ID. This feature is currently only available to the whitelist;</li>
<li>When OriginType is SPACE, specify this parameter with the origin shield space ID. This feature is currently only available to the whitelist.</li>
    */
    @SerializedName("Origin")
    @Expose
    private String Origin;

    /**
    * The ID of the secondary origin group. This parameter is valid only when OriginType is ORIGIN_GROUP. This field indicates the old version capability, which cannot be configured or modified on the control panel after being called. Please submit a ticket if required.
    */
    @SerializedName("BackupOrigin")
    @Expose
    private String BackupOrigin;

    /**
    * Whether access to the private Cloud Object Storage origin server is allowed. This parameter is valid only when OriginType is COS or AWS_S3. Valid values:
<li>on: Enable private authentication;</li>
<li>off: Disable private authentication.</li>
If it is not specified, the default value is off.
    */
    @SerializedName("PrivateAccess")
    @Expose
    private String PrivateAccess;

    /**
    * Private authentication parameter. This parameter is valid only when PrivateAccess is on.
    */
    @SerializedName("PrivateParameters")
    @Expose
    private PrivateParameter [] PrivateParameters;

    /**
    * VODEO sub-application ID. This parameter is required when OriginType is VODEO.
    */
    @SerializedName("VodeoSubAppId")
    @Expose
    private Long VodeoSubAppId;

    /**
    * VODEO distribution range. This parameter is required when OriginType is VODEO. Valid values:
<li>All: All storage buckets under the current application;</li>
<li>Bucket: A specified storage bucket.</li>
    */
    @SerializedName("VodeoDistributionRange")
    @Expose
    private String VodeoDistributionRange;

    /**
    * VODEO storage bucket ID. This parameter is required when OriginType is VODEO and VodeoDistributionRange is Bucket.
    */
    @SerializedName("VodeoBucketId")
    @Expose
    private String VodeoBucketId;

    /**
     * Get The origin server type, with values:
<li>IP_DOMAIN: IPv4, IPv6, or domain name type origin server;</li>
<li>COS: Tencent Cloud COS origin server;</li>
<li>AWS_S3: AWS S3 origin server;</li>
<li>ORIGIN_GROUP: origin server group type origin server;</li>
<li>VODEO: VOD on EO;</li>
<li>SPACE: origin server uninstallation. Currently only available to the allowlist;</li>
<li>LB: load balancing. Currently only available to the allowlist. </li> 
     * @return OriginType The origin server type, with values:
<li>IP_DOMAIN: IPv4, IPv6, or domain name type origin server;</li>
<li>COS: Tencent Cloud COS origin server;</li>
<li>AWS_S3: AWS S3 origin server;</li>
<li>ORIGIN_GROUP: origin server group type origin server;</li>
<li>VODEO: VOD on EO;</li>
<li>SPACE: origin server uninstallation. Currently only available to the allowlist;</li>
<li>LB: load balancing. Currently only available to the allowlist. </li>
     */
    public String getOriginType() {
        return this.OriginType;
    }

    /**
     * Set The origin server type, with values:
<li>IP_DOMAIN: IPv4, IPv6, or domain name type origin server;</li>
<li>COS: Tencent Cloud COS origin server;</li>
<li>AWS_S3: AWS S3 origin server;</li>
<li>ORIGIN_GROUP: origin server group type origin server;</li>
<li>VODEO: VOD on EO;</li>
<li>SPACE: origin server uninstallation. Currently only available to the allowlist;</li>
<li>LB: load balancing. Currently only available to the allowlist. </li>
     * @param OriginType The origin server type, with values:
<li>IP_DOMAIN: IPv4, IPv6, or domain name type origin server;</li>
<li>COS: Tencent Cloud COS origin server;</li>
<li>AWS_S3: AWS S3 origin server;</li>
<li>ORIGIN_GROUP: origin server group type origin server;</li>
<li>VODEO: VOD on EO;</li>
<li>SPACE: origin server uninstallation. Currently only available to the allowlist;</li>
<li>LB: load balancing. Currently only available to the allowlist. </li>
     */
    public void setOriginType(String OriginType) {
        this.OriginType = OriginType;
    }

    /**
     * Get Origin server address, varying depending on the value of OriginType:
<li>When OriginType is IP_DOMAIN, specify this parameter with IPv4, IPv6, or domain name;</li>
<li>When OriginType is COS, specify this parameter with the COS bucket access domain name;</li>
<li>When OriginType is AWS_S3, specify this parameter with the S3 bucket access domain name;</li>
<li>When OriginType is ORIGIN_GROUP, specify this parameter with the origin group ID;</li>
<li>When OriginType is VODEO and VodeoDistributionRange is ALL, specify this parameter with "all-buckets-in-vodeo-application"; if VodeoDistributionRange is Bucket, specify this parameter with the corresponding storage bucket domain name;</li>
<li>When OriginType is LB, specify the Cloud Load Balancer instance ID. This feature is currently only available to the whitelist;</li>
<li>When OriginType is SPACE, specify this parameter with the origin shield space ID. This feature is currently only available to the whitelist.</li> 
     * @return Origin Origin server address, varying depending on the value of OriginType:
<li>When OriginType is IP_DOMAIN, specify this parameter with IPv4, IPv6, or domain name;</li>
<li>When OriginType is COS, specify this parameter with the COS bucket access domain name;</li>
<li>When OriginType is AWS_S3, specify this parameter with the S3 bucket access domain name;</li>
<li>When OriginType is ORIGIN_GROUP, specify this parameter with the origin group ID;</li>
<li>When OriginType is VODEO and VodeoDistributionRange is ALL, specify this parameter with "all-buckets-in-vodeo-application"; if VodeoDistributionRange is Bucket, specify this parameter with the corresponding storage bucket domain name;</li>
<li>When OriginType is LB, specify the Cloud Load Balancer instance ID. This feature is currently only available to the whitelist;</li>
<li>When OriginType is SPACE, specify this parameter with the origin shield space ID. This feature is currently only available to the whitelist.</li>
     */
    public String getOrigin() {
        return this.Origin;
    }

    /**
     * Set Origin server address, varying depending on the value of OriginType:
<li>When OriginType is IP_DOMAIN, specify this parameter with IPv4, IPv6, or domain name;</li>
<li>When OriginType is COS, specify this parameter with the COS bucket access domain name;</li>
<li>When OriginType is AWS_S3, specify this parameter with the S3 bucket access domain name;</li>
<li>When OriginType is ORIGIN_GROUP, specify this parameter with the origin group ID;</li>
<li>When OriginType is VODEO and VodeoDistributionRange is ALL, specify this parameter with "all-buckets-in-vodeo-application"; if VodeoDistributionRange is Bucket, specify this parameter with the corresponding storage bucket domain name;</li>
<li>When OriginType is LB, specify the Cloud Load Balancer instance ID. This feature is currently only available to the whitelist;</li>
<li>When OriginType is SPACE, specify this parameter with the origin shield space ID. This feature is currently only available to the whitelist.</li>
     * @param Origin Origin server address, varying depending on the value of OriginType:
<li>When OriginType is IP_DOMAIN, specify this parameter with IPv4, IPv6, or domain name;</li>
<li>When OriginType is COS, specify this parameter with the COS bucket access domain name;</li>
<li>When OriginType is AWS_S3, specify this parameter with the S3 bucket access domain name;</li>
<li>When OriginType is ORIGIN_GROUP, specify this parameter with the origin group ID;</li>
<li>When OriginType is VODEO and VodeoDistributionRange is ALL, specify this parameter with "all-buckets-in-vodeo-application"; if VodeoDistributionRange is Bucket, specify this parameter with the corresponding storage bucket domain name;</li>
<li>When OriginType is LB, specify the Cloud Load Balancer instance ID. This feature is currently only available to the whitelist;</li>
<li>When OriginType is SPACE, specify this parameter with the origin shield space ID. This feature is currently only available to the whitelist.</li>
     */
    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }

    /**
     * Get The ID of the secondary origin group. This parameter is valid only when OriginType is ORIGIN_GROUP. This field indicates the old version capability, which cannot be configured or modified on the control panel after being called. Please submit a ticket if required. 
     * @return BackupOrigin The ID of the secondary origin group. This parameter is valid only when OriginType is ORIGIN_GROUP. This field indicates the old version capability, which cannot be configured or modified on the control panel after being called. Please submit a ticket if required.
     */
    public String getBackupOrigin() {
        return this.BackupOrigin;
    }

    /**
     * Set The ID of the secondary origin group. This parameter is valid only when OriginType is ORIGIN_GROUP. This field indicates the old version capability, which cannot be configured or modified on the control panel after being called. Please submit a ticket if required.
     * @param BackupOrigin The ID of the secondary origin group. This parameter is valid only when OriginType is ORIGIN_GROUP. This field indicates the old version capability, which cannot be configured or modified on the control panel after being called. Please submit a ticket if required.
     */
    public void setBackupOrigin(String BackupOrigin) {
        this.BackupOrigin = BackupOrigin;
    }

    /**
     * Get Whether access to the private Cloud Object Storage origin server is allowed. This parameter is valid only when OriginType is COS or AWS_S3. Valid values:
<li>on: Enable private authentication;</li>
<li>off: Disable private authentication.</li>
If it is not specified, the default value is off. 
     * @return PrivateAccess Whether access to the private Cloud Object Storage origin server is allowed. This parameter is valid only when OriginType is COS or AWS_S3. Valid values:
<li>on: Enable private authentication;</li>
<li>off: Disable private authentication.</li>
If it is not specified, the default value is off.
     */
    public String getPrivateAccess() {
        return this.PrivateAccess;
    }

    /**
     * Set Whether access to the private Cloud Object Storage origin server is allowed. This parameter is valid only when OriginType is COS or AWS_S3. Valid values:
<li>on: Enable private authentication;</li>
<li>off: Disable private authentication.</li>
If it is not specified, the default value is off.
     * @param PrivateAccess Whether access to the private Cloud Object Storage origin server is allowed. This parameter is valid only when OriginType is COS or AWS_S3. Valid values:
<li>on: Enable private authentication;</li>
<li>off: Disable private authentication.</li>
If it is not specified, the default value is off.
     */
    public void setPrivateAccess(String PrivateAccess) {
        this.PrivateAccess = PrivateAccess;
    }

    /**
     * Get Private authentication parameter. This parameter is valid only when PrivateAccess is on. 
     * @return PrivateParameters Private authentication parameter. This parameter is valid only when PrivateAccess is on.
     */
    public PrivateParameter [] getPrivateParameters() {
        return this.PrivateParameters;
    }

    /**
     * Set Private authentication parameter. This parameter is valid only when PrivateAccess is on.
     * @param PrivateParameters Private authentication parameter. This parameter is valid only when PrivateAccess is on.
     */
    public void setPrivateParameters(PrivateParameter [] PrivateParameters) {
        this.PrivateParameters = PrivateParameters;
    }

    /**
     * Get VODEO sub-application ID. This parameter is required when OriginType is VODEO. 
     * @return VodeoSubAppId VODEO sub-application ID. This parameter is required when OriginType is VODEO.
     */
    public Long getVodeoSubAppId() {
        return this.VodeoSubAppId;
    }

    /**
     * Set VODEO sub-application ID. This parameter is required when OriginType is VODEO.
     * @param VodeoSubAppId VODEO sub-application ID. This parameter is required when OriginType is VODEO.
     */
    public void setVodeoSubAppId(Long VodeoSubAppId) {
        this.VodeoSubAppId = VodeoSubAppId;
    }

    /**
     * Get VODEO distribution range. This parameter is required when OriginType is VODEO. Valid values:
<li>All: All storage buckets under the current application;</li>
<li>Bucket: A specified storage bucket.</li> 
     * @return VodeoDistributionRange VODEO distribution range. This parameter is required when OriginType is VODEO. Valid values:
<li>All: All storage buckets under the current application;</li>
<li>Bucket: A specified storage bucket.</li>
     */
    public String getVodeoDistributionRange() {
        return this.VodeoDistributionRange;
    }

    /**
     * Set VODEO distribution range. This parameter is required when OriginType is VODEO. Valid values:
<li>All: All storage buckets under the current application;</li>
<li>Bucket: A specified storage bucket.</li>
     * @param VodeoDistributionRange VODEO distribution range. This parameter is required when OriginType is VODEO. Valid values:
<li>All: All storage buckets under the current application;</li>
<li>Bucket: A specified storage bucket.</li>
     */
    public void setVodeoDistributionRange(String VodeoDistributionRange) {
        this.VodeoDistributionRange = VodeoDistributionRange;
    }

    /**
     * Get VODEO storage bucket ID. This parameter is required when OriginType is VODEO and VodeoDistributionRange is Bucket. 
     * @return VodeoBucketId VODEO storage bucket ID. This parameter is required when OriginType is VODEO and VodeoDistributionRange is Bucket.
     */
    public String getVodeoBucketId() {
        return this.VodeoBucketId;
    }

    /**
     * Set VODEO storage bucket ID. This parameter is required when OriginType is VODEO and VodeoDistributionRange is Bucket.
     * @param VodeoBucketId VODEO storage bucket ID. This parameter is required when OriginType is VODEO and VodeoDistributionRange is Bucket.
     */
    public void setVodeoBucketId(String VodeoBucketId) {
        this.VodeoBucketId = VodeoBucketId;
    }

    public OriginInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OriginInfo(OriginInfo source) {
        if (source.OriginType != null) {
            this.OriginType = new String(source.OriginType);
        }
        if (source.Origin != null) {
            this.Origin = new String(source.Origin);
        }
        if (source.BackupOrigin != null) {
            this.BackupOrigin = new String(source.BackupOrigin);
        }
        if (source.PrivateAccess != null) {
            this.PrivateAccess = new String(source.PrivateAccess);
        }
        if (source.PrivateParameters != null) {
            this.PrivateParameters = new PrivateParameter[source.PrivateParameters.length];
            for (int i = 0; i < source.PrivateParameters.length; i++) {
                this.PrivateParameters[i] = new PrivateParameter(source.PrivateParameters[i]);
            }
        }
        if (source.VodeoSubAppId != null) {
            this.VodeoSubAppId = new Long(source.VodeoSubAppId);
        }
        if (source.VodeoDistributionRange != null) {
            this.VodeoDistributionRange = new String(source.VodeoDistributionRange);
        }
        if (source.VodeoBucketId != null) {
            this.VodeoBucketId = new String(source.VodeoBucketId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OriginType", this.OriginType);
        this.setParamSimple(map, prefix + "Origin", this.Origin);
        this.setParamSimple(map, prefix + "BackupOrigin", this.BackupOrigin);
        this.setParamSimple(map, prefix + "PrivateAccess", this.PrivateAccess);
        this.setParamArrayObj(map, prefix + "PrivateParameters.", this.PrivateParameters);
        this.setParamSimple(map, prefix + "VodeoSubAppId", this.VodeoSubAppId);
        this.setParamSimple(map, prefix + "VodeoDistributionRange", this.VodeoDistributionRange);
        this.setParamSimple(map, prefix + "VodeoBucketId", this.VodeoBucketId);

    }
}

