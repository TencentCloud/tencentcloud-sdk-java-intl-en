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

public class OriginDetail extends AbstractModel {

    /**
    * Origin server type. Valid values:
<li>IP_DOMAIN: IPv4, IPv6, or domain name type origin server;</li>
<li>COS: Tencent Cloud COS origin server;</li>
<li>AWS_S3: AWS S3 COS origin server;</li>
<li>ORIGIN_GROUP: origin server group;</li>
<li>VOD: Video on Demand;</li>
<li>SPACE: origin server uninstallation, currently only available to the allowlist;</li>
<li>LB: load balancing. Currently only available to the allowlist. </li>
    */
    @SerializedName("OriginType")
    @Expose
    private String OriginType;

    /**
    * Origin server address, which varies with the value of OriginType:
<li>When OriginType = IP_DOMAIN, this parameter is an IPv4 address, an IPv6 address, or a domain name.</li>
<li>When OriginType = COS, this parameter is the access domain name of the COS bucket.</li>
<li>When OriginType = AWS_S3, this parameter is the access domain name of the S3 bucket.</li>
<li>When OriginType = ORIGIN_GROUP, this parameter is the origin server group ID.</li>
<li>When OriginType = VOD, this parameter is the VOD application ID.</li>
    */
    @SerializedName("Origin")
    @Expose
    private String Origin;

    /**
    * Secondary origin group ID. This parameter is valid only when OriginType is ORIGIN_GROUP and a secondary origin group is configured.
    */
    @SerializedName("BackupOrigin")
    @Expose
    private String BackupOrigin;

    /**
    * Primary origin group name. This parameter returns a value when OriginType is ORIGIN_GROUP.
    */
    @SerializedName("OriginGroupName")
    @Expose
    private String OriginGroupName;

    /**
    * Secondary origin group name. This parameter is valid only when OriginType is ORIGIN_GROUP and a secondary origin group is configured.
    */
    @SerializedName("BackOriginGroupName")
    @Expose
    private String BackOriginGroupName;

    /**
    * Whether access to the private object storage origin server is allowed. This parameter is valid only when the origin server type OriginType is COS or AWS_S3. Valid values:
<li>on: Enable private authentication;</li>
<li>off: Disable private authentication. </li>
If this field is not specified, the default value 'off' will be used.
    */
    @SerializedName("PrivateAccess")
    @Expose
    private String PrivateAccess;

    /**
    * Private authentication parameter. This parameter is valid only when PrivateAccess is on.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PrivateParameters")
    @Expose
    private PrivateParameter [] PrivateParameters;

    /**
    * current configured origin HOST header.
    */
    @SerializedName("HostHeader")
    @Expose
    private String HostHeader;

    /**
    * MO sub-application ID
    */
    @SerializedName("VodeoSubAppId")
    @Expose
    private Long VodeoSubAppId;

    /**
    * MO distribution range. Valid values: <li>All: all</li> <li>Bucket: bucket</li>
    */
    @SerializedName("VodeoDistributionRange")
    @Expose
    private String VodeoDistributionRange;

    /**
    * MO bucket ID, required when the distribution range (DistributionRange) is bucket (Bucket)
    */
    @SerializedName("VodeoBucketId")
    @Expose
    private String VodeoBucketId;

    /**
    * VOD origin-pull range. this parameter returns a value when OriginType = VOD. valid values: <li>all: all files in the VOD application corresponding to the current origin server. the default value is all;</li> <li>bucket: files in a specified bucket under the VOD application corresponding to the current origin server. specify the bucket by the VodBucketId parameter.</li>.
</li>
    */
    @SerializedName("VodOriginScope")
    @Expose
    private String VodOriginScope;

    /**
    * VOD bucket ID. this parameter is required when OriginType = VOD and VodOriginScope = bucket. data source: storage ID of the bucket under the VOD professional application.
    */
    @SerializedName("VodBucketId")
    @Expose
    private String VodBucketId;

    /**
     * Get Origin server type. Valid values:
<li>IP_DOMAIN: IPv4, IPv6, or domain name type origin server;</li>
<li>COS: Tencent Cloud COS origin server;</li>
<li>AWS_S3: AWS S3 COS origin server;</li>
<li>ORIGIN_GROUP: origin server group;</li>
<li>VOD: Video on Demand;</li>
<li>SPACE: origin server uninstallation, currently only available to the allowlist;</li>
<li>LB: load balancing. Currently only available to the allowlist. </li> 
     * @return OriginType Origin server type. Valid values:
<li>IP_DOMAIN: IPv4, IPv6, or domain name type origin server;</li>
<li>COS: Tencent Cloud COS origin server;</li>
<li>AWS_S3: AWS S3 COS origin server;</li>
<li>ORIGIN_GROUP: origin server group;</li>
<li>VOD: Video on Demand;</li>
<li>SPACE: origin server uninstallation, currently only available to the allowlist;</li>
<li>LB: load balancing. Currently only available to the allowlist. </li>
     */
    public String getOriginType() {
        return this.OriginType;
    }

    /**
     * Set Origin server type. Valid values:
<li>IP_DOMAIN: IPv4, IPv6, or domain name type origin server;</li>
<li>COS: Tencent Cloud COS origin server;</li>
<li>AWS_S3: AWS S3 COS origin server;</li>
<li>ORIGIN_GROUP: origin server group;</li>
<li>VOD: Video on Demand;</li>
<li>SPACE: origin server uninstallation, currently only available to the allowlist;</li>
<li>LB: load balancing. Currently only available to the allowlist. </li>
     * @param OriginType Origin server type. Valid values:
<li>IP_DOMAIN: IPv4, IPv6, or domain name type origin server;</li>
<li>COS: Tencent Cloud COS origin server;</li>
<li>AWS_S3: AWS S3 COS origin server;</li>
<li>ORIGIN_GROUP: origin server group;</li>
<li>VOD: Video on Demand;</li>
<li>SPACE: origin server uninstallation, currently only available to the allowlist;</li>
<li>LB: load balancing. Currently only available to the allowlist. </li>
     */
    public void setOriginType(String OriginType) {
        this.OriginType = OriginType;
    }

    /**
     * Get Origin server address, which varies with the value of OriginType:
<li>When OriginType = IP_DOMAIN, this parameter is an IPv4 address, an IPv6 address, or a domain name.</li>
<li>When OriginType = COS, this parameter is the access domain name of the COS bucket.</li>
<li>When OriginType = AWS_S3, this parameter is the access domain name of the S3 bucket.</li>
<li>When OriginType = ORIGIN_GROUP, this parameter is the origin server group ID.</li>
<li>When OriginType = VOD, this parameter is the VOD application ID.</li> 
     * @return Origin Origin server address, which varies with the value of OriginType:
<li>When OriginType = IP_DOMAIN, this parameter is an IPv4 address, an IPv6 address, or a domain name.</li>
<li>When OriginType = COS, this parameter is the access domain name of the COS bucket.</li>
<li>When OriginType = AWS_S3, this parameter is the access domain name of the S3 bucket.</li>
<li>When OriginType = ORIGIN_GROUP, this parameter is the origin server group ID.</li>
<li>When OriginType = VOD, this parameter is the VOD application ID.</li>
     */
    public String getOrigin() {
        return this.Origin;
    }

    /**
     * Set Origin server address, which varies with the value of OriginType:
<li>When OriginType = IP_DOMAIN, this parameter is an IPv4 address, an IPv6 address, or a domain name.</li>
<li>When OriginType = COS, this parameter is the access domain name of the COS bucket.</li>
<li>When OriginType = AWS_S3, this parameter is the access domain name of the S3 bucket.</li>
<li>When OriginType = ORIGIN_GROUP, this parameter is the origin server group ID.</li>
<li>When OriginType = VOD, this parameter is the VOD application ID.</li>
     * @param Origin Origin server address, which varies with the value of OriginType:
<li>When OriginType = IP_DOMAIN, this parameter is an IPv4 address, an IPv6 address, or a domain name.</li>
<li>When OriginType = COS, this parameter is the access domain name of the COS bucket.</li>
<li>When OriginType = AWS_S3, this parameter is the access domain name of the S3 bucket.</li>
<li>When OriginType = ORIGIN_GROUP, this parameter is the origin server group ID.</li>
<li>When OriginType = VOD, this parameter is the VOD application ID.</li>
     */
    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }

    /**
     * Get Secondary origin group ID. This parameter is valid only when OriginType is ORIGIN_GROUP and a secondary origin group is configured. 
     * @return BackupOrigin Secondary origin group ID. This parameter is valid only when OriginType is ORIGIN_GROUP and a secondary origin group is configured.
     */
    public String getBackupOrigin() {
        return this.BackupOrigin;
    }

    /**
     * Set Secondary origin group ID. This parameter is valid only when OriginType is ORIGIN_GROUP and a secondary origin group is configured.
     * @param BackupOrigin Secondary origin group ID. This parameter is valid only when OriginType is ORIGIN_GROUP and a secondary origin group is configured.
     */
    public void setBackupOrigin(String BackupOrigin) {
        this.BackupOrigin = BackupOrigin;
    }

    /**
     * Get Primary origin group name. This parameter returns a value when OriginType is ORIGIN_GROUP. 
     * @return OriginGroupName Primary origin group name. This parameter returns a value when OriginType is ORIGIN_GROUP.
     */
    public String getOriginGroupName() {
        return this.OriginGroupName;
    }

    /**
     * Set Primary origin group name. This parameter returns a value when OriginType is ORIGIN_GROUP.
     * @param OriginGroupName Primary origin group name. This parameter returns a value when OriginType is ORIGIN_GROUP.
     */
    public void setOriginGroupName(String OriginGroupName) {
        this.OriginGroupName = OriginGroupName;
    }

    /**
     * Get Secondary origin group name. This parameter is valid only when OriginType is ORIGIN_GROUP and a secondary origin group is configured. 
     * @return BackOriginGroupName Secondary origin group name. This parameter is valid only when OriginType is ORIGIN_GROUP and a secondary origin group is configured.
     */
    public String getBackOriginGroupName() {
        return this.BackOriginGroupName;
    }

    /**
     * Set Secondary origin group name. This parameter is valid only when OriginType is ORIGIN_GROUP and a secondary origin group is configured.
     * @param BackOriginGroupName Secondary origin group name. This parameter is valid only when OriginType is ORIGIN_GROUP and a secondary origin group is configured.
     */
    public void setBackOriginGroupName(String BackOriginGroupName) {
        this.BackOriginGroupName = BackOriginGroupName;
    }

    /**
     * Get Whether access to the private object storage origin server is allowed. This parameter is valid only when the origin server type OriginType is COS or AWS_S3. Valid values:
<li>on: Enable private authentication;</li>
<li>off: Disable private authentication. </li>
If this field is not specified, the default value 'off' will be used. 
     * @return PrivateAccess Whether access to the private object storage origin server is allowed. This parameter is valid only when the origin server type OriginType is COS or AWS_S3. Valid values:
<li>on: Enable private authentication;</li>
<li>off: Disable private authentication. </li>
If this field is not specified, the default value 'off' will be used.
     */
    public String getPrivateAccess() {
        return this.PrivateAccess;
    }

    /**
     * Set Whether access to the private object storage origin server is allowed. This parameter is valid only when the origin server type OriginType is COS or AWS_S3. Valid values:
<li>on: Enable private authentication;</li>
<li>off: Disable private authentication. </li>
If this field is not specified, the default value 'off' will be used.
     * @param PrivateAccess Whether access to the private object storage origin server is allowed. This parameter is valid only when the origin server type OriginType is COS or AWS_S3. Valid values:
<li>on: Enable private authentication;</li>
<li>off: Disable private authentication. </li>
If this field is not specified, the default value 'off' will be used.
     */
    public void setPrivateAccess(String PrivateAccess) {
        this.PrivateAccess = PrivateAccess;
    }

    /**
     * Get Private authentication parameter. This parameter is valid only when PrivateAccess is on.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PrivateParameters Private authentication parameter. This parameter is valid only when PrivateAccess is on.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public PrivateParameter [] getPrivateParameters() {
        return this.PrivateParameters;
    }

    /**
     * Set Private authentication parameter. This parameter is valid only when PrivateAccess is on.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PrivateParameters Private authentication parameter. This parameter is valid only when PrivateAccess is on.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPrivateParameters(PrivateParameter [] PrivateParameters) {
        this.PrivateParameters = PrivateParameters;
    }

    /**
     * Get current configured origin HOST header. 
     * @return HostHeader current configured origin HOST header.
     */
    public String getHostHeader() {
        return this.HostHeader;
    }

    /**
     * Set current configured origin HOST header.
     * @param HostHeader current configured origin HOST header.
     */
    public void setHostHeader(String HostHeader) {
        this.HostHeader = HostHeader;
    }

    /**
     * Get MO sub-application ID 
     * @return VodeoSubAppId MO sub-application ID
     * @deprecated
     */
    @Deprecated
    public Long getVodeoSubAppId() {
        return this.VodeoSubAppId;
    }

    /**
     * Set MO sub-application ID
     * @param VodeoSubAppId MO sub-application ID
     * @deprecated
     */
    @Deprecated
    public void setVodeoSubAppId(Long VodeoSubAppId) {
        this.VodeoSubAppId = VodeoSubAppId;
    }

    /**
     * Get MO distribution range. Valid values: <li>All: all</li> <li>Bucket: bucket</li> 
     * @return VodeoDistributionRange MO distribution range. Valid values: <li>All: all</li> <li>Bucket: bucket</li>
     * @deprecated
     */
    @Deprecated
    public String getVodeoDistributionRange() {
        return this.VodeoDistributionRange;
    }

    /**
     * Set MO distribution range. Valid values: <li>All: all</li> <li>Bucket: bucket</li>
     * @param VodeoDistributionRange MO distribution range. Valid values: <li>All: all</li> <li>Bucket: bucket</li>
     * @deprecated
     */
    @Deprecated
    public void setVodeoDistributionRange(String VodeoDistributionRange) {
        this.VodeoDistributionRange = VodeoDistributionRange;
    }

    /**
     * Get MO bucket ID, required when the distribution range (DistributionRange) is bucket (Bucket) 
     * @return VodeoBucketId MO bucket ID, required when the distribution range (DistributionRange) is bucket (Bucket)
     * @deprecated
     */
    @Deprecated
    public String getVodeoBucketId() {
        return this.VodeoBucketId;
    }

    /**
     * Set MO bucket ID, required when the distribution range (DistributionRange) is bucket (Bucket)
     * @param VodeoBucketId MO bucket ID, required when the distribution range (DistributionRange) is bucket (Bucket)
     * @deprecated
     */
    @Deprecated
    public void setVodeoBucketId(String VodeoBucketId) {
        this.VodeoBucketId = VodeoBucketId;
    }

    /**
     * Get VOD origin-pull range. this parameter returns a value when OriginType = VOD. valid values: <li>all: all files in the VOD application corresponding to the current origin server. the default value is all;</li> <li>bucket: files in a specified bucket under the VOD application corresponding to the current origin server. specify the bucket by the VodBucketId parameter.</li>.
</li> 
     * @return VodOriginScope VOD origin-pull range. this parameter returns a value when OriginType = VOD. valid values: <li>all: all files in the VOD application corresponding to the current origin server. the default value is all;</li> <li>bucket: files in a specified bucket under the VOD application corresponding to the current origin server. specify the bucket by the VodBucketId parameter.</li>.
</li>
     */
    public String getVodOriginScope() {
        return this.VodOriginScope;
    }

    /**
     * Set VOD origin-pull range. this parameter returns a value when OriginType = VOD. valid values: <li>all: all files in the VOD application corresponding to the current origin server. the default value is all;</li> <li>bucket: files in a specified bucket under the VOD application corresponding to the current origin server. specify the bucket by the VodBucketId parameter.</li>.
</li>
     * @param VodOriginScope VOD origin-pull range. this parameter returns a value when OriginType = VOD. valid values: <li>all: all files in the VOD application corresponding to the current origin server. the default value is all;</li> <li>bucket: files in a specified bucket under the VOD application corresponding to the current origin server. specify the bucket by the VodBucketId parameter.</li>.
</li>
     */
    public void setVodOriginScope(String VodOriginScope) {
        this.VodOriginScope = VodOriginScope;
    }

    /**
     * Get VOD bucket ID. this parameter is required when OriginType = VOD and VodOriginScope = bucket. data source: storage ID of the bucket under the VOD professional application. 
     * @return VodBucketId VOD bucket ID. this parameter is required when OriginType = VOD and VodOriginScope = bucket. data source: storage ID of the bucket under the VOD professional application.
     */
    public String getVodBucketId() {
        return this.VodBucketId;
    }

    /**
     * Set VOD bucket ID. this parameter is required when OriginType = VOD and VodOriginScope = bucket. data source: storage ID of the bucket under the VOD professional application.
     * @param VodBucketId VOD bucket ID. this parameter is required when OriginType = VOD and VodOriginScope = bucket. data source: storage ID of the bucket under the VOD professional application.
     */
    public void setVodBucketId(String VodBucketId) {
        this.VodBucketId = VodBucketId;
    }

    public OriginDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OriginDetail(OriginDetail source) {
        if (source.OriginType != null) {
            this.OriginType = new String(source.OriginType);
        }
        if (source.Origin != null) {
            this.Origin = new String(source.Origin);
        }
        if (source.BackupOrigin != null) {
            this.BackupOrigin = new String(source.BackupOrigin);
        }
        if (source.OriginGroupName != null) {
            this.OriginGroupName = new String(source.OriginGroupName);
        }
        if (source.BackOriginGroupName != null) {
            this.BackOriginGroupName = new String(source.BackOriginGroupName);
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
        this.setParamSimple(map, prefix + "OriginGroupName", this.OriginGroupName);
        this.setParamSimple(map, prefix + "BackOriginGroupName", this.BackOriginGroupName);
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

