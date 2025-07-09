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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OriginInfo extends AbstractModel {

    /**
    * Origin server type, with values:
<li>IP_DOMAIN: IPv4, IPv6, or domain name type origin server;</li>
<li>COS: Tencent Cloud COS origin server;</li>
<li>AWS_S3: AWS S3 origin server;</li>
<li>ORIGIN_GROUP: origin server group type origin server;</li>
 <li>VOD: Video on Demand;</li>
<li>SPACE: origin server uninstallation. Currently only available to the allowlist;</li>
<li>LB: load balancing. Currently only available to the allowlist. </li>
    */
    @SerializedName("OriginType")
    @Expose
    private String OriginType;

    /**
    * Origin server address, which varies according to the value of OriginType:
<li>When OriginType = IP_DOMAIN, fill in an IPv4 address, an IPv6 address, or a domain name;</li>
<li>When OriginType = COS, fill in the access domain name of the COS bucket;</li>
<li>When OriginType = AWS_S3, fill in the access domain name of the S3 bucket;</li>
<li>When OriginType = ORIGIN_GROUP, fill in the origin server group ID;</li>
<li>When OriginType = VOD, fill in the VOD application ID;</li>
<li>When OriginType = LB, fill in the Cloud Load Balancer instance ID. This feature is currently only available to the allowlist;</li>
<li>When OriginType = SPACE, fill in the origin server uninstallation space ID. This feature is currently only available to the allowlist.</li>
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
    * Custom origin server HOST header. this parameter is valid only when OriginType=IP_DOMAIN.If the OriginType is another type of origin, this parameter does not need to be passed in, otherwise an error will be reported.
If OriginType is COS or AWS_S3, the HOST header for origin-pull will remain consistent with the origin server domain name.
If OriginType is ORIGIN_GROUP, the HOST header follows the ORIGIN site GROUP configuration. if not configured, it defaults to the acceleration domain name.
If OriginType is VOD or SPACE, no configuration is required for this header, and the domain name takes effect based on the corresponding origin.
    */
    @SerializedName("HostHeader")
    @Expose
    private String HostHeader;

    /**
    * VODEO sub-application ID. This parameter is required when OriginType is VODEO.
    */
    @SerializedName("VodeoSubAppId")
    @Expose
    private Long VodeoSubAppId;

    /**
    * VOD on EO distribution range. This parameter is required when OriginType = VODEO. The values are: 
<li>All: all buckets under the current application;</li> 
<li>Bucket: a specified bucket.</li>
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
    * VOD origin-pull scope. this parameter is valid only when OriginType = VOD. valid values: <li>all: all files in the VOD application corresponding to the current origin server. the default value is all;</li> <li>bucket: files in a specified bucket under the VOD application corresponding to the current origin server. specify the bucket by the parameter VodBucketId.</li>.
</li>
    */
    @SerializedName("VodOriginScope")
    @Expose
    private String VodOriginScope;

    /**
    * VOD bucket ID. this parameter is required when OriginType = VOD and VodOriginScope = bucket. data source: storage ID of the bucket under the VOD professional edition application.
    */
    @SerializedName("VodBucketId")
    @Expose
    private String VodBucketId;

    /**
     * Get Origin server type, with values:
<li>IP_DOMAIN: IPv4, IPv6, or domain name type origin server;</li>
<li>COS: Tencent Cloud COS origin server;</li>
<li>AWS_S3: AWS S3 origin server;</li>
<li>ORIGIN_GROUP: origin server group type origin server;</li>
 <li>VOD: Video on Demand;</li>
<li>SPACE: origin server uninstallation. Currently only available to the allowlist;</li>
<li>LB: load balancing. Currently only available to the allowlist. </li> 
     * @return OriginType Origin server type, with values:
<li>IP_DOMAIN: IPv4, IPv6, or domain name type origin server;</li>
<li>COS: Tencent Cloud COS origin server;</li>
<li>AWS_S3: AWS S3 origin server;</li>
<li>ORIGIN_GROUP: origin server group type origin server;</li>
 <li>VOD: Video on Demand;</li>
<li>SPACE: origin server uninstallation. Currently only available to the allowlist;</li>
<li>LB: load balancing. Currently only available to the allowlist. </li>
     */
    public String getOriginType() {
        return this.OriginType;
    }

    /**
     * Set Origin server type, with values:
<li>IP_DOMAIN: IPv4, IPv6, or domain name type origin server;</li>
<li>COS: Tencent Cloud COS origin server;</li>
<li>AWS_S3: AWS S3 origin server;</li>
<li>ORIGIN_GROUP: origin server group type origin server;</li>
 <li>VOD: Video on Demand;</li>
<li>SPACE: origin server uninstallation. Currently only available to the allowlist;</li>
<li>LB: load balancing. Currently only available to the allowlist. </li>
     * @param OriginType Origin server type, with values:
<li>IP_DOMAIN: IPv4, IPv6, or domain name type origin server;</li>
<li>COS: Tencent Cloud COS origin server;</li>
<li>AWS_S3: AWS S3 origin server;</li>
<li>ORIGIN_GROUP: origin server group type origin server;</li>
 <li>VOD: Video on Demand;</li>
<li>SPACE: origin server uninstallation. Currently only available to the allowlist;</li>
<li>LB: load balancing. Currently only available to the allowlist. </li>
     */
    public void setOriginType(String OriginType) {
        this.OriginType = OriginType;
    }

    /**
     * Get Origin server address, which varies according to the value of OriginType:
<li>When OriginType = IP_DOMAIN, fill in an IPv4 address, an IPv6 address, or a domain name;</li>
<li>When OriginType = COS, fill in the access domain name of the COS bucket;</li>
<li>When OriginType = AWS_S3, fill in the access domain name of the S3 bucket;</li>
<li>When OriginType = ORIGIN_GROUP, fill in the origin server group ID;</li>
<li>When OriginType = VOD, fill in the VOD application ID;</li>
<li>When OriginType = LB, fill in the Cloud Load Balancer instance ID. This feature is currently only available to the allowlist;</li>
<li>When OriginType = SPACE, fill in the origin server uninstallation space ID. This feature is currently only available to the allowlist.</li> 
     * @return Origin Origin server address, which varies according to the value of OriginType:
<li>When OriginType = IP_DOMAIN, fill in an IPv4 address, an IPv6 address, or a domain name;</li>
<li>When OriginType = COS, fill in the access domain name of the COS bucket;</li>
<li>When OriginType = AWS_S3, fill in the access domain name of the S3 bucket;</li>
<li>When OriginType = ORIGIN_GROUP, fill in the origin server group ID;</li>
<li>When OriginType = VOD, fill in the VOD application ID;</li>
<li>When OriginType = LB, fill in the Cloud Load Balancer instance ID. This feature is currently only available to the allowlist;</li>
<li>When OriginType = SPACE, fill in the origin server uninstallation space ID. This feature is currently only available to the allowlist.</li>
     */
    public String getOrigin() {
        return this.Origin;
    }

    /**
     * Set Origin server address, which varies according to the value of OriginType:
<li>When OriginType = IP_DOMAIN, fill in an IPv4 address, an IPv6 address, or a domain name;</li>
<li>When OriginType = COS, fill in the access domain name of the COS bucket;</li>
<li>When OriginType = AWS_S3, fill in the access domain name of the S3 bucket;</li>
<li>When OriginType = ORIGIN_GROUP, fill in the origin server group ID;</li>
<li>When OriginType = VOD, fill in the VOD application ID;</li>
<li>When OriginType = LB, fill in the Cloud Load Balancer instance ID. This feature is currently only available to the allowlist;</li>
<li>When OriginType = SPACE, fill in the origin server uninstallation space ID. This feature is currently only available to the allowlist.</li>
     * @param Origin Origin server address, which varies according to the value of OriginType:
<li>When OriginType = IP_DOMAIN, fill in an IPv4 address, an IPv6 address, or a domain name;</li>
<li>When OriginType = COS, fill in the access domain name of the COS bucket;</li>
<li>When OriginType = AWS_S3, fill in the access domain name of the S3 bucket;</li>
<li>When OriginType = ORIGIN_GROUP, fill in the origin server group ID;</li>
<li>When OriginType = VOD, fill in the VOD application ID;</li>
<li>When OriginType = LB, fill in the Cloud Load Balancer instance ID. This feature is currently only available to the allowlist;</li>
<li>When OriginType = SPACE, fill in the origin server uninstallation space ID. This feature is currently only available to the allowlist.</li>
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
     * Get Custom origin server HOST header. this parameter is valid only when OriginType=IP_DOMAIN.If the OriginType is another type of origin, this parameter does not need to be passed in, otherwise an error will be reported.
If OriginType is COS or AWS_S3, the HOST header for origin-pull will remain consistent with the origin server domain name.
If OriginType is ORIGIN_GROUP, the HOST header follows the ORIGIN site GROUP configuration. if not configured, it defaults to the acceleration domain name.
If OriginType is VOD or SPACE, no configuration is required for this header, and the domain name takes effect based on the corresponding origin. 
     * @return HostHeader Custom origin server HOST header. this parameter is valid only when OriginType=IP_DOMAIN.If the OriginType is another type of origin, this parameter does not need to be passed in, otherwise an error will be reported.
If OriginType is COS or AWS_S3, the HOST header for origin-pull will remain consistent with the origin server domain name.
If OriginType is ORIGIN_GROUP, the HOST header follows the ORIGIN site GROUP configuration. if not configured, it defaults to the acceleration domain name.
If OriginType is VOD or SPACE, no configuration is required for this header, and the domain name takes effect based on the corresponding origin.
     */
    public String getHostHeader() {
        return this.HostHeader;
    }

    /**
     * Set Custom origin server HOST header. this parameter is valid only when OriginType=IP_DOMAIN.If the OriginType is another type of origin, this parameter does not need to be passed in, otherwise an error will be reported.
If OriginType is COS or AWS_S3, the HOST header for origin-pull will remain consistent with the origin server domain name.
If OriginType is ORIGIN_GROUP, the HOST header follows the ORIGIN site GROUP configuration. if not configured, it defaults to the acceleration domain name.
If OriginType is VOD or SPACE, no configuration is required for this header, and the domain name takes effect based on the corresponding origin.
     * @param HostHeader Custom origin server HOST header. this parameter is valid only when OriginType=IP_DOMAIN.If the OriginType is another type of origin, this parameter does not need to be passed in, otherwise an error will be reported.
If OriginType is COS or AWS_S3, the HOST header for origin-pull will remain consistent with the origin server domain name.
If OriginType is ORIGIN_GROUP, the HOST header follows the ORIGIN site GROUP configuration. if not configured, it defaults to the acceleration domain name.
If OriginType is VOD or SPACE, no configuration is required for this header, and the domain name takes effect based on the corresponding origin.
     */
    public void setHostHeader(String HostHeader) {
        this.HostHeader = HostHeader;
    }

    /**
     * Get VODEO sub-application ID. This parameter is required when OriginType is VODEO. 
     * @return VodeoSubAppId VODEO sub-application ID. This parameter is required when OriginType is VODEO.
     * @deprecated
     */
    @Deprecated
    public Long getVodeoSubAppId() {
        return this.VodeoSubAppId;
    }

    /**
     * Set VODEO sub-application ID. This parameter is required when OriginType is VODEO.
     * @param VodeoSubAppId VODEO sub-application ID. This parameter is required when OriginType is VODEO.
     * @deprecated
     */
    @Deprecated
    public void setVodeoSubAppId(Long VodeoSubAppId) {
        this.VodeoSubAppId = VodeoSubAppId;
    }

    /**
     * Get VOD on EO distribution range. This parameter is required when OriginType = VODEO. The values are: 
<li>All: all buckets under the current application;</li> 
<li>Bucket: a specified bucket.</li> 
     * @return VodeoDistributionRange VOD on EO distribution range. This parameter is required when OriginType = VODEO. The values are: 
<li>All: all buckets under the current application;</li> 
<li>Bucket: a specified bucket.</li>
     * @deprecated
     */
    @Deprecated
    public String getVodeoDistributionRange() {
        return this.VodeoDistributionRange;
    }

    /**
     * Set VOD on EO distribution range. This parameter is required when OriginType = VODEO. The values are: 
<li>All: all buckets under the current application;</li> 
<li>Bucket: a specified bucket.</li>
     * @param VodeoDistributionRange VOD on EO distribution range. This parameter is required when OriginType = VODEO. The values are: 
<li>All: all buckets under the current application;</li> 
<li>Bucket: a specified bucket.</li>
     * @deprecated
     */
    @Deprecated
    public void setVodeoDistributionRange(String VodeoDistributionRange) {
        this.VodeoDistributionRange = VodeoDistributionRange;
    }

    /**
     * Get VODEO storage bucket ID. This parameter is required when OriginType is VODEO and VodeoDistributionRange is Bucket. 
     * @return VodeoBucketId VODEO storage bucket ID. This parameter is required when OriginType is VODEO and VodeoDistributionRange is Bucket.
     * @deprecated
     */
    @Deprecated
    public String getVodeoBucketId() {
        return this.VodeoBucketId;
    }

    /**
     * Set VODEO storage bucket ID. This parameter is required when OriginType is VODEO and VodeoDistributionRange is Bucket.
     * @param VodeoBucketId VODEO storage bucket ID. This parameter is required when OriginType is VODEO and VodeoDistributionRange is Bucket.
     * @deprecated
     */
    @Deprecated
    public void setVodeoBucketId(String VodeoBucketId) {
        this.VodeoBucketId = VodeoBucketId;
    }

    /**
     * Get VOD origin-pull scope. this parameter is valid only when OriginType = VOD. valid values: <li>all: all files in the VOD application corresponding to the current origin server. the default value is all;</li> <li>bucket: files in a specified bucket under the VOD application corresponding to the current origin server. specify the bucket by the parameter VodBucketId.</li>.
</li> 
     * @return VodOriginScope VOD origin-pull scope. this parameter is valid only when OriginType = VOD. valid values: <li>all: all files in the VOD application corresponding to the current origin server. the default value is all;</li> <li>bucket: files in a specified bucket under the VOD application corresponding to the current origin server. specify the bucket by the parameter VodBucketId.</li>.
</li>
     */
    public String getVodOriginScope() {
        return this.VodOriginScope;
    }

    /**
     * Set VOD origin-pull scope. this parameter is valid only when OriginType = VOD. valid values: <li>all: all files in the VOD application corresponding to the current origin server. the default value is all;</li> <li>bucket: files in a specified bucket under the VOD application corresponding to the current origin server. specify the bucket by the parameter VodBucketId.</li>.
</li>
     * @param VodOriginScope VOD origin-pull scope. this parameter is valid only when OriginType = VOD. valid values: <li>all: all files in the VOD application corresponding to the current origin server. the default value is all;</li> <li>bucket: files in a specified bucket under the VOD application corresponding to the current origin server. specify the bucket by the parameter VodBucketId.</li>.
</li>
     */
    public void setVodOriginScope(String VodOriginScope) {
        this.VodOriginScope = VodOriginScope;
    }

    /**
     * Get VOD bucket ID. this parameter is required when OriginType = VOD and VodOriginScope = bucket. data source: storage ID of the bucket under the VOD professional edition application. 
     * @return VodBucketId VOD bucket ID. this parameter is required when OriginType = VOD and VodOriginScope = bucket. data source: storage ID of the bucket under the VOD professional edition application.
     */
    public String getVodBucketId() {
        return this.VodBucketId;
    }

    /**
     * Set VOD bucket ID. this parameter is required when OriginType = VOD and VodOriginScope = bucket. data source: storage ID of the bucket under the VOD professional edition application.
     * @param VodBucketId VOD bucket ID. this parameter is required when OriginType = VOD and VodOriginScope = bucket. data source: storage ID of the bucket under the VOD professional edition application.
     */
    public void setVodBucketId(String VodBucketId) {
        this.VodBucketId = VodBucketId;
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
        if (source.HostHeader != null) {
            this.HostHeader = new String(source.HostHeader);
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
        if (source.VodOriginScope != null) {
            this.VodOriginScope = new String(source.VodOriginScope);
        }
        if (source.VodBucketId != null) {
            this.VodBucketId = new String(source.VodBucketId);
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
        this.setParamSimple(map, prefix + "HostHeader", this.HostHeader);
        this.setParamSimple(map, prefix + "VodeoSubAppId", this.VodeoSubAppId);
        this.setParamSimple(map, prefix + "VodeoDistributionRange", this.VodeoDistributionRange);
        this.setParamSimple(map, prefix + "VodeoBucketId", this.VodeoBucketId);
        this.setParamSimple(map, prefix + "VodOriginScope", this.VodOriginScope);
        this.setParamSimple(map, prefix + "VodBucketId", this.VodBucketId);

    }
}

