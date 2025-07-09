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
package com.tencentcloudapi.vod.v20240718.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateStorageCredentialsRequest extends AbstractModel {

    /**
    * <b>The ID of [VOD Professional Application](http://tencentcloud.com/document/product/266/67977).</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * The policy string serialized by URL Encode is used as the input parameter Policy. The server will URL Decode the Policy value and grant temporary access credentials according to the parsed policy. Please pass in parameters according to the specification.
Note:
1.The policy syntax refers to [Cloud Access Management](/document/product/598/10603).
2.The policy cannot contain the principal element.
3.The policy actions include: 
<li>name/vod:ListObjects;</li>
<li>name/vod:ListObjectsV2;</li>
<li>name/vod:HeadObject;</li>
<li>name/vod:PutObject;</li>
<li>name/vod:ListParts;</li>
<li>name/vod:PostObject;</li>
<li>name/vod:CreateMultipartUpload;</li>
<li>name/vod:UploadPart;</li>
<li>name/vod:CompleteMultipartUpload;</li>
<li>name/vod:AbortMultipartUpload;</li>
<li>name/vod:ListMultipartUploads;</li>
<li>name/vod:CopyObject;</li>
<li>name/vod:RestoreObject;</li>
<li>name/vod:DeleteObjects;</li>
<li>name/vod:DeleteObject;</li>
<li>name/vod:UploadPartCopy.</li>4.The resource format of the policy is `qcs::vod:[region]:uid/[AppID]:prefix//[SubAppId]/[BucketId]/[Path]`, where AppID, SubAppId, BucketId and Path need to be filled in as required.

    */
    @SerializedName("Policy")
    @Expose
    private String Policy;

    /**
    * Specifies the validity period of credentials in seconds. The default value is 1800 seconds and the maximum value is 129600 seconds.
    */
    @SerializedName("DurationSeconds")
    @Expose
    private Long DurationSeconds;

    /**
     * Get <b>The ID of [VOD Professional Application](http://tencentcloud.com/document/product/266/67977).</b> 
     * @return SubAppId <b>The ID of [VOD Professional Application](http://tencentcloud.com/document/product/266/67977).</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>The ID of [VOD Professional Application](http://tencentcloud.com/document/product/266/67977).</b>
     * @param SubAppId <b>The ID of [VOD Professional Application](http://tencentcloud.com/document/product/266/67977).</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get The policy string serialized by URL Encode is used as the input parameter Policy. The server will URL Decode the Policy value and grant temporary access credentials according to the parsed policy. Please pass in parameters according to the specification.
Note:
1.The policy syntax refers to [Cloud Access Management](/document/product/598/10603).
2.The policy cannot contain the principal element.
3.The policy actions include: 
<li>name/vod:ListObjects;</li>
<li>name/vod:ListObjectsV2;</li>
<li>name/vod:HeadObject;</li>
<li>name/vod:PutObject;</li>
<li>name/vod:ListParts;</li>
<li>name/vod:PostObject;</li>
<li>name/vod:CreateMultipartUpload;</li>
<li>name/vod:UploadPart;</li>
<li>name/vod:CompleteMultipartUpload;</li>
<li>name/vod:AbortMultipartUpload;</li>
<li>name/vod:ListMultipartUploads;</li>
<li>name/vod:CopyObject;</li>
<li>name/vod:RestoreObject;</li>
<li>name/vod:DeleteObjects;</li>
<li>name/vod:DeleteObject;</li>
<li>name/vod:UploadPartCopy.</li>4.The resource format of the policy is `qcs::vod:[region]:uid/[AppID]:prefix//[SubAppId]/[BucketId]/[Path]`, where AppID, SubAppId, BucketId and Path need to be filled in as required.
 
     * @return Policy The policy string serialized by URL Encode is used as the input parameter Policy. The server will URL Decode the Policy value and grant temporary access credentials according to the parsed policy. Please pass in parameters according to the specification.
Note:
1.The policy syntax refers to [Cloud Access Management](/document/product/598/10603).
2.The policy cannot contain the principal element.
3.The policy actions include: 
<li>name/vod:ListObjects;</li>
<li>name/vod:ListObjectsV2;</li>
<li>name/vod:HeadObject;</li>
<li>name/vod:PutObject;</li>
<li>name/vod:ListParts;</li>
<li>name/vod:PostObject;</li>
<li>name/vod:CreateMultipartUpload;</li>
<li>name/vod:UploadPart;</li>
<li>name/vod:CompleteMultipartUpload;</li>
<li>name/vod:AbortMultipartUpload;</li>
<li>name/vod:ListMultipartUploads;</li>
<li>name/vod:CopyObject;</li>
<li>name/vod:RestoreObject;</li>
<li>name/vod:DeleteObjects;</li>
<li>name/vod:DeleteObject;</li>
<li>name/vod:UploadPartCopy.</li>4.The resource format of the policy is `qcs::vod:[region]:uid/[AppID]:prefix//[SubAppId]/[BucketId]/[Path]`, where AppID, SubAppId, BucketId and Path need to be filled in as required.

     */
    public String getPolicy() {
        return this.Policy;
    }

    /**
     * Set The policy string serialized by URL Encode is used as the input parameter Policy. The server will URL Decode the Policy value and grant temporary access credentials according to the parsed policy. Please pass in parameters according to the specification.
Note:
1.The policy syntax refers to [Cloud Access Management](/document/product/598/10603).
2.The policy cannot contain the principal element.
3.The policy actions include: 
<li>name/vod:ListObjects;</li>
<li>name/vod:ListObjectsV2;</li>
<li>name/vod:HeadObject;</li>
<li>name/vod:PutObject;</li>
<li>name/vod:ListParts;</li>
<li>name/vod:PostObject;</li>
<li>name/vod:CreateMultipartUpload;</li>
<li>name/vod:UploadPart;</li>
<li>name/vod:CompleteMultipartUpload;</li>
<li>name/vod:AbortMultipartUpload;</li>
<li>name/vod:ListMultipartUploads;</li>
<li>name/vod:CopyObject;</li>
<li>name/vod:RestoreObject;</li>
<li>name/vod:DeleteObjects;</li>
<li>name/vod:DeleteObject;</li>
<li>name/vod:UploadPartCopy.</li>4.The resource format of the policy is `qcs::vod:[region]:uid/[AppID]:prefix//[SubAppId]/[BucketId]/[Path]`, where AppID, SubAppId, BucketId and Path need to be filled in as required.

     * @param Policy The policy string serialized by URL Encode is used as the input parameter Policy. The server will URL Decode the Policy value and grant temporary access credentials according to the parsed policy. Please pass in parameters according to the specification.
Note:
1.The policy syntax refers to [Cloud Access Management](/document/product/598/10603).
2.The policy cannot contain the principal element.
3.The policy actions include: 
<li>name/vod:ListObjects;</li>
<li>name/vod:ListObjectsV2;</li>
<li>name/vod:HeadObject;</li>
<li>name/vod:PutObject;</li>
<li>name/vod:ListParts;</li>
<li>name/vod:PostObject;</li>
<li>name/vod:CreateMultipartUpload;</li>
<li>name/vod:UploadPart;</li>
<li>name/vod:CompleteMultipartUpload;</li>
<li>name/vod:AbortMultipartUpload;</li>
<li>name/vod:ListMultipartUploads;</li>
<li>name/vod:CopyObject;</li>
<li>name/vod:RestoreObject;</li>
<li>name/vod:DeleteObjects;</li>
<li>name/vod:DeleteObject;</li>
<li>name/vod:UploadPartCopy.</li>4.The resource format of the policy is `qcs::vod:[region]:uid/[AppID]:prefix//[SubAppId]/[BucketId]/[Path]`, where AppID, SubAppId, BucketId and Path need to be filled in as required.

     */
    public void setPolicy(String Policy) {
        this.Policy = Policy;
    }

    /**
     * Get Specifies the validity period of credentials in seconds. The default value is 1800 seconds and the maximum value is 129600 seconds. 
     * @return DurationSeconds Specifies the validity period of credentials in seconds. The default value is 1800 seconds and the maximum value is 129600 seconds.
     */
    public Long getDurationSeconds() {
        return this.DurationSeconds;
    }

    /**
     * Set Specifies the validity period of credentials in seconds. The default value is 1800 seconds and the maximum value is 129600 seconds.
     * @param DurationSeconds Specifies the validity period of credentials in seconds. The default value is 1800 seconds and the maximum value is 129600 seconds.
     */
    public void setDurationSeconds(Long DurationSeconds) {
        this.DurationSeconds = DurationSeconds;
    }

    public CreateStorageCredentialsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateStorageCredentialsRequest(CreateStorageCredentialsRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.Policy != null) {
            this.Policy = new String(source.Policy);
        }
        if (source.DurationSeconds != null) {
            this.DurationSeconds = new Long(source.DurationSeconds);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Policy", this.Policy);
        this.setParamSimple(map, prefix + "DurationSeconds", this.DurationSeconds);

    }
}

