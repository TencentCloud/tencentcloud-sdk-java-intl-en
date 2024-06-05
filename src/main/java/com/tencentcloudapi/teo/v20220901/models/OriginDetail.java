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

public class OriginDetail extends AbstractModel {

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
    * Origin server address, which varies according to the value of OriginType:
<li>For OriginType = IP_DOMAIN, this parameter is an IPv4, IPv6 address or domain name;</li>
<li>For OriginType = COS, this parameter is the access domain name of the COS bucket;</li>
<li>For OriginType = AWS_S3, this parameter is the access domain name of the S3 bucket;</li>
<li>For OriginType = ORIGIN_GROUP, this parameter is the origin server group ID;</li>
<li>When OriginType = VODEO, if VodeoDistributionRange = ALL, then this parameter is "all-buckets-in-vodeo-application"; if VodeoDistributionRange = Bucket, then this parameter is the domain name of the corresponding bucket. </li>
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
     * Get Origin server address, which varies according to the value of OriginType:
<li>For OriginType = IP_DOMAIN, this parameter is an IPv4, IPv6 address or domain name;</li>
<li>For OriginType = COS, this parameter is the access domain name of the COS bucket;</li>
<li>For OriginType = AWS_S3, this parameter is the access domain name of the S3 bucket;</li>
<li>For OriginType = ORIGIN_GROUP, this parameter is the origin server group ID;</li>
<li>When OriginType = VODEO, if VodeoDistributionRange = ALL, then this parameter is "all-buckets-in-vodeo-application"; if VodeoDistributionRange = Bucket, then this parameter is the domain name of the corresponding bucket. </li> 
     * @return Origin Origin server address, which varies according to the value of OriginType:
<li>For OriginType = IP_DOMAIN, this parameter is an IPv4, IPv6 address or domain name;</li>
<li>For OriginType = COS, this parameter is the access domain name of the COS bucket;</li>
<li>For OriginType = AWS_S3, this parameter is the access domain name of the S3 bucket;</li>
<li>For OriginType = ORIGIN_GROUP, this parameter is the origin server group ID;</li>
<li>When OriginType = VODEO, if VodeoDistributionRange = ALL, then this parameter is "all-buckets-in-vodeo-application"; if VodeoDistributionRange = Bucket, then this parameter is the domain name of the corresponding bucket. </li>
     */
    public String getOrigin() {
        return this.Origin;
    }

    /**
     * Set Origin server address, which varies according to the value of OriginType:
<li>For OriginType = IP_DOMAIN, this parameter is an IPv4, IPv6 address or domain name;</li>
<li>For OriginType = COS, this parameter is the access domain name of the COS bucket;</li>
<li>For OriginType = AWS_S3, this parameter is the access domain name of the S3 bucket;</li>
<li>For OriginType = ORIGIN_GROUP, this parameter is the origin server group ID;</li>
<li>When OriginType = VODEO, if VodeoDistributionRange = ALL, then this parameter is "all-buckets-in-vodeo-application"; if VodeoDistributionRange = Bucket, then this parameter is the domain name of the corresponding bucket. </li>
     * @param Origin Origin server address, which varies according to the value of OriginType:
<li>For OriginType = IP_DOMAIN, this parameter is an IPv4, IPv6 address or domain name;</li>
<li>For OriginType = COS, this parameter is the access domain name of the COS bucket;</li>
<li>For OriginType = AWS_S3, this parameter is the access domain name of the S3 bucket;</li>
<li>For OriginType = ORIGIN_GROUP, this parameter is the origin server group ID;</li>
<li>When OriginType = VODEO, if VodeoDistributionRange = ALL, then this parameter is "all-buckets-in-vodeo-application"; if VodeoDistributionRange = Bucket, then this parameter is the domain name of the corresponding bucket. </li>
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
     * Get MO sub-application ID 
     * @return VodeoSubAppId MO sub-application ID
     */
    public Long getVodeoSubAppId() {
        return this.VodeoSubAppId;
    }

    /**
     * Set MO sub-application ID
     * @param VodeoSubAppId MO sub-application ID
     */
    public void setVodeoSubAppId(Long VodeoSubAppId) {
        this.VodeoSubAppId = VodeoSubAppId;
    }

    /**
     * Get MO distribution range. Valid values: <li>All: all</li> <li>Bucket: bucket</li> 
     * @return VodeoDistributionRange MO distribution range. Valid values: <li>All: all</li> <li>Bucket: bucket</li>
     */
    public String getVodeoDistributionRange() {
        return this.VodeoDistributionRange;
    }

    /**
     * Set MO distribution range. Valid values: <li>All: all</li> <li>Bucket: bucket</li>
     * @param VodeoDistributionRange MO distribution range. Valid values: <li>All: all</li> <li>Bucket: bucket</li>
     */
    public void setVodeoDistributionRange(String VodeoDistributionRange) {
        this.VodeoDistributionRange = VodeoDistributionRange;
    }

    /**
     * Get MO bucket ID, required when the distribution range (DistributionRange) is bucket (Bucket) 
     * @return VodeoBucketId MO bucket ID, required when the distribution range (DistributionRange) is bucket (Bucket)
     */
    public String getVodeoBucketId() {
        return this.VodeoBucketId;
    }

    /**
     * Set MO bucket ID, required when the distribution range (DistributionRange) is bucket (Bucket)
     * @param VodeoBucketId MO bucket ID, required when the distribution range (DistributionRange) is bucket (Bucket)
     */
    public void setVodeoBucketId(String VodeoBucketId) {
        this.VodeoBucketId = VodeoBucketId;
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
        this.setParamSimple(map, prefix + "OriginGroupName", this.OriginGroupName);
        this.setParamSimple(map, prefix + "BackOriginGroupName", this.BackOriginGroupName);
        this.setParamSimple(map, prefix + "PrivateAccess", this.PrivateAccess);
        this.setParamArrayObj(map, prefix + "PrivateParameters.", this.PrivateParameters);
        this.setParamSimple(map, prefix + "VodeoSubAppId", this.VodeoSubAppId);
        this.setParamSimple(map, prefix + "VodeoDistributionRange", this.VodeoDistributionRange);
        this.setParamSimple(map, prefix + "VodeoBucketId", this.VodeoBucketId);

    }
}

