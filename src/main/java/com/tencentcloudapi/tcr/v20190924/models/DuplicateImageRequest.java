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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DuplicateImageRequest extends AbstractModel {

    /**
    * Instance ID.
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * Source namespace name.
    */
    @SerializedName("SourceNamespace")
    @Expose
    private String SourceNamespace;

    /**
    * Source image repository name.
    */
    @SerializedName("SourceRepo")
    @Expose
    private String SourceRepo;

    /**
    * Source image tag or digest value. Currently, only tag is supported.
    */
    @SerializedName("SourceReference")
    @Expose
    private String SourceReference;

    /**
    * Destination image version.
    */
    @SerializedName("DestinationTag")
    @Expose
    private String DestinationTag;

    /**
    * Destination namespace. Defaults to the same as the source if not filled.
    */
    @SerializedName("DestinationNamespace")
    @Expose
    private String DestinationNamespace;

    /**
    * Destination image repository. Defaults to the same as the source if not filled.
    */
    @SerializedName("DestinationRepo")
    @Expose
    private String DestinationRepo;

    /**
    * Whether to overwrite.
    */
    @SerializedName("Override")
    @Expose
    private Boolean Override;

    /**
     * Get Instance ID. 
     * @return RegistryId Instance ID.
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set Instance ID.
     * @param RegistryId Instance ID.
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get Source namespace name. 
     * @return SourceNamespace Source namespace name.
     */
    public String getSourceNamespace() {
        return this.SourceNamespace;
    }

    /**
     * Set Source namespace name.
     * @param SourceNamespace Source namespace name.
     */
    public void setSourceNamespace(String SourceNamespace) {
        this.SourceNamespace = SourceNamespace;
    }

    /**
     * Get Source image repository name. 
     * @return SourceRepo Source image repository name.
     */
    public String getSourceRepo() {
        return this.SourceRepo;
    }

    /**
     * Set Source image repository name.
     * @param SourceRepo Source image repository name.
     */
    public void setSourceRepo(String SourceRepo) {
        this.SourceRepo = SourceRepo;
    }

    /**
     * Get Source image tag or digest value. Currently, only tag is supported. 
     * @return SourceReference Source image tag or digest value. Currently, only tag is supported.
     */
    public String getSourceReference() {
        return this.SourceReference;
    }

    /**
     * Set Source image tag or digest value. Currently, only tag is supported.
     * @param SourceReference Source image tag or digest value. Currently, only tag is supported.
     */
    public void setSourceReference(String SourceReference) {
        this.SourceReference = SourceReference;
    }

    /**
     * Get Destination image version. 
     * @return DestinationTag Destination image version.
     */
    public String getDestinationTag() {
        return this.DestinationTag;
    }

    /**
     * Set Destination image version.
     * @param DestinationTag Destination image version.
     */
    public void setDestinationTag(String DestinationTag) {
        this.DestinationTag = DestinationTag;
    }

    /**
     * Get Destination namespace. Defaults to the same as the source if not filled. 
     * @return DestinationNamespace Destination namespace. Defaults to the same as the source if not filled.
     */
    public String getDestinationNamespace() {
        return this.DestinationNamespace;
    }

    /**
     * Set Destination namespace. Defaults to the same as the source if not filled.
     * @param DestinationNamespace Destination namespace. Defaults to the same as the source if not filled.
     */
    public void setDestinationNamespace(String DestinationNamespace) {
        this.DestinationNamespace = DestinationNamespace;
    }

    /**
     * Get Destination image repository. Defaults to the same as the source if not filled. 
     * @return DestinationRepo Destination image repository. Defaults to the same as the source if not filled.
     */
    public String getDestinationRepo() {
        return this.DestinationRepo;
    }

    /**
     * Set Destination image repository. Defaults to the same as the source if not filled.
     * @param DestinationRepo Destination image repository. Defaults to the same as the source if not filled.
     */
    public void setDestinationRepo(String DestinationRepo) {
        this.DestinationRepo = DestinationRepo;
    }

    /**
     * Get Whether to overwrite. 
     * @return Override Whether to overwrite.
     */
    public Boolean getOverride() {
        return this.Override;
    }

    /**
     * Set Whether to overwrite.
     * @param Override Whether to overwrite.
     */
    public void setOverride(Boolean Override) {
        this.Override = Override;
    }

    public DuplicateImageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DuplicateImageRequest(DuplicateImageRequest source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.SourceNamespace != null) {
            this.SourceNamespace = new String(source.SourceNamespace);
        }
        if (source.SourceRepo != null) {
            this.SourceRepo = new String(source.SourceRepo);
        }
        if (source.SourceReference != null) {
            this.SourceReference = new String(source.SourceReference);
        }
        if (source.DestinationTag != null) {
            this.DestinationTag = new String(source.DestinationTag);
        }
        if (source.DestinationNamespace != null) {
            this.DestinationNamespace = new String(source.DestinationNamespace);
        }
        if (source.DestinationRepo != null) {
            this.DestinationRepo = new String(source.DestinationRepo);
        }
        if (source.Override != null) {
            this.Override = new Boolean(source.Override);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "SourceNamespace", this.SourceNamespace);
        this.setParamSimple(map, prefix + "SourceRepo", this.SourceRepo);
        this.setParamSimple(map, prefix + "SourceReference", this.SourceReference);
        this.setParamSimple(map, prefix + "DestinationTag", this.DestinationTag);
        this.setParamSimple(map, prefix + "DestinationNamespace", this.DestinationNamespace);
        this.setParamSimple(map, prefix + "DestinationRepo", this.DestinationRepo);
        this.setParamSimple(map, prefix + "Override", this.Override);

    }
}

