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

public class ImageInfo extends AbstractModel {

    /**
    * Image region.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * TCR instance ID.
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * Domain name.
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * Namespace.
    */
    @SerializedName("NamespaceName")
    @Expose
    private String NamespaceName;

    /**
    * Image repository name.
    */
    @SerializedName("RepositoryName")
    @Expose
    private String RepositoryName;

    /**
    * Image version.
    */
    @SerializedName("ImageVersion")
    @Expose
    private String ImageVersion;

    /**
    * Image pull policy.
    */
    @SerializedName("ImagePullPolicy")
    @Expose
    private String ImagePullPolicy;

    /**
    * Image address.
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
     * Get Image region. 
     * @return Region Image region.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Image region.
     * @param Region Image region.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get TCR instance ID. 
     * @return RegistryId TCR instance ID.
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set TCR instance ID.
     * @param RegistryId TCR instance ID.
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get Domain name. 
     * @return DomainName Domain name.
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set Domain name.
     * @param DomainName Domain name.
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get Namespace. 
     * @return NamespaceName Namespace.
     */
    public String getNamespaceName() {
        return this.NamespaceName;
    }

    /**
     * Set Namespace.
     * @param NamespaceName Namespace.
     */
    public void setNamespaceName(String NamespaceName) {
        this.NamespaceName = NamespaceName;
    }

    /**
     * Get Image repository name. 
     * @return RepositoryName Image repository name.
     */
    public String getRepositoryName() {
        return this.RepositoryName;
    }

    /**
     * Set Image repository name.
     * @param RepositoryName Image repository name.
     */
    public void setRepositoryName(String RepositoryName) {
        this.RepositoryName = RepositoryName;
    }

    /**
     * Get Image version. 
     * @return ImageVersion Image version.
     */
    public String getImageVersion() {
        return this.ImageVersion;
    }

    /**
     * Set Image version.
     * @param ImageVersion Image version.
     */
    public void setImageVersion(String ImageVersion) {
        this.ImageVersion = ImageVersion;
    }

    /**
     * Get Image pull policy. 
     * @return ImagePullPolicy Image pull policy.
     */
    public String getImagePullPolicy() {
        return this.ImagePullPolicy;
    }

    /**
     * Set Image pull policy.
     * @param ImagePullPolicy Image pull policy.
     */
    public void setImagePullPolicy(String ImagePullPolicy) {
        this.ImagePullPolicy = ImagePullPolicy;
    }

    /**
     * Get Image address. 
     * @return Image Image address.
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set Image address.
     * @param Image Image address.
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    public ImageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageInfo(ImageInfo source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.NamespaceName != null) {
            this.NamespaceName = new String(source.NamespaceName);
        }
        if (source.RepositoryName != null) {
            this.RepositoryName = new String(source.RepositoryName);
        }
        if (source.ImageVersion != null) {
            this.ImageVersion = new String(source.ImageVersion);
        }
        if (source.ImagePullPolicy != null) {
            this.ImagePullPolicy = new String(source.ImagePullPolicy);
        }
        if (source.Image != null) {
            this.Image = new String(source.Image);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "NamespaceName", this.NamespaceName);
        this.setParamSimple(map, prefix + "RepositoryName", this.RepositoryName);
        this.setParamSimple(map, prefix + "ImageVersion", this.ImageVersion);
        this.setParamSimple(map, prefix + "ImagePullPolicy", this.ImagePullPolicy);
        this.setParamSimple(map, prefix + "Image", this.Image);

    }
}

