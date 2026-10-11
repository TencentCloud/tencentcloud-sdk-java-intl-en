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

public class ImageInfoV2 extends AbstractModel {

    /**
    * <p>Image type.</p><p>Enumeration values:</p><ul><li>official: official image</li><li>custom: custom image</li><li>imageUrl: image URL</li></ul>
    */
    @SerializedName("ImageMode")
    @Expose
    private String ImageMode;

    /**
    * <p>Region.</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>Whether it is an existing image.</p>
    */
    @SerializedName("LegacyCCR")
    @Expose
    private Boolean LegacyCCR;

    /**
    * <p>Image URL.</p>
    */
    @SerializedName("FullImageUrl")
    @Expose
    private String FullImageUrl;

    /**
    * <p>Version.</p>
    */
    @SerializedName("MainVersion")
    @Expose
    private String MainVersion;

    /**
    * <p>Image URL domain name.</p>
    */
    @SerializedName("RegistryUrl")
    @Expose
    private String RegistryUrl;

    /**
    * <p>Image namespace.</p>
    */
    @SerializedName("NamespaceName")
    @Expose
    private String NamespaceName;

    /**
    * <p>Image repository name.</p>
    */
    @SerializedName("RepoName")
    @Expose
    private String RepoName;

    /**
    * <p>Image version tag.</p>
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
    * <p>Username.</p>
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * <p>Password.</p>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * <p>Image pull secret.</p>
    */
    @SerializedName("ImagePullSecret")
    @Expose
    private ImagePullSecret ImagePullSecret;

    /**
    * <p>Image pull policy.</p>
    */
    @SerializedName("ImagePullPolicy")
    @Expose
    private String ImagePullPolicy;

    /**
     * Get <p>Image type.</p><p>Enumeration values:</p><ul><li>official: official image</li><li>custom: custom image</li><li>imageUrl: image URL</li></ul> 
     * @return ImageMode <p>Image type.</p><p>Enumeration values:</p><ul><li>official: official image</li><li>custom: custom image</li><li>imageUrl: image URL</li></ul>
     */
    public String getImageMode() {
        return this.ImageMode;
    }

    /**
     * Set <p>Image type.</p><p>Enumeration values:</p><ul><li>official: official image</li><li>custom: custom image</li><li>imageUrl: image URL</li></ul>
     * @param ImageMode <p>Image type.</p><p>Enumeration values:</p><ul><li>official: official image</li><li>custom: custom image</li><li>imageUrl: image URL</li></ul>
     */
    public void setImageMode(String ImageMode) {
        this.ImageMode = ImageMode;
    }

    /**
     * Get <p>Region.</p> 
     * @return Region <p>Region.</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>Region.</p>
     * @param Region <p>Region.</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>Whether it is an existing image.</p> 
     * @return LegacyCCR <p>Whether it is an existing image.</p>
     */
    public Boolean getLegacyCCR() {
        return this.LegacyCCR;
    }

    /**
     * Set <p>Whether it is an existing image.</p>
     * @param LegacyCCR <p>Whether it is an existing image.</p>
     */
    public void setLegacyCCR(Boolean LegacyCCR) {
        this.LegacyCCR = LegacyCCR;
    }

    /**
     * Get <p>Image URL.</p> 
     * @return FullImageUrl <p>Image URL.</p>
     */
    public String getFullImageUrl() {
        return this.FullImageUrl;
    }

    /**
     * Set <p>Image URL.</p>
     * @param FullImageUrl <p>Image URL.</p>
     */
    public void setFullImageUrl(String FullImageUrl) {
        this.FullImageUrl = FullImageUrl;
    }

    /**
     * Get <p>Version.</p> 
     * @return MainVersion <p>Version.</p>
     */
    public String getMainVersion() {
        return this.MainVersion;
    }

    /**
     * Set <p>Version.</p>
     * @param MainVersion <p>Version.</p>
     */
    public void setMainVersion(String MainVersion) {
        this.MainVersion = MainVersion;
    }

    /**
     * Get <p>Image URL domain name.</p> 
     * @return RegistryUrl <p>Image URL domain name.</p>
     */
    public String getRegistryUrl() {
        return this.RegistryUrl;
    }

    /**
     * Set <p>Image URL domain name.</p>
     * @param RegistryUrl <p>Image URL domain name.</p>
     */
    public void setRegistryUrl(String RegistryUrl) {
        this.RegistryUrl = RegistryUrl;
    }

    /**
     * Get <p>Image namespace.</p> 
     * @return NamespaceName <p>Image namespace.</p>
     */
    public String getNamespaceName() {
        return this.NamespaceName;
    }

    /**
     * Set <p>Image namespace.</p>
     * @param NamespaceName <p>Image namespace.</p>
     */
    public void setNamespaceName(String NamespaceName) {
        this.NamespaceName = NamespaceName;
    }

    /**
     * Get <p>Image repository name.</p> 
     * @return RepoName <p>Image repository name.</p>
     */
    public String getRepoName() {
        return this.RepoName;
    }

    /**
     * Set <p>Image repository name.</p>
     * @param RepoName <p>Image repository name.</p>
     */
    public void setRepoName(String RepoName) {
        this.RepoName = RepoName;
    }

    /**
     * Get <p>Image version tag.</p> 
     * @return Tag <p>Image version tag.</p>
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set <p>Image version tag.</p>
     * @param Tag <p>Image version tag.</p>
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    /**
     * Get <p>Username.</p> 
     * @return Username <p>Username.</p>
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set <p>Username.</p>
     * @param Username <p>Username.</p>
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get <p>Password.</p> 
     * @return Password <p>Password.</p>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>Password.</p>
     * @param Password <p>Password.</p>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get <p>Image pull secret.</p> 
     * @return ImagePullSecret <p>Image pull secret.</p>
     */
    public ImagePullSecret getImagePullSecret() {
        return this.ImagePullSecret;
    }

    /**
     * Set <p>Image pull secret.</p>
     * @param ImagePullSecret <p>Image pull secret.</p>
     */
    public void setImagePullSecret(ImagePullSecret ImagePullSecret) {
        this.ImagePullSecret = ImagePullSecret;
    }

    /**
     * Get <p>Image pull policy.</p> 
     * @return ImagePullPolicy <p>Image pull policy.</p>
     */
    public String getImagePullPolicy() {
        return this.ImagePullPolicy;
    }

    /**
     * Set <p>Image pull policy.</p>
     * @param ImagePullPolicy <p>Image pull policy.</p>
     */
    public void setImagePullPolicy(String ImagePullPolicy) {
        this.ImagePullPolicy = ImagePullPolicy;
    }

    public ImageInfoV2() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageInfoV2(ImageInfoV2 source) {
        if (source.ImageMode != null) {
            this.ImageMode = new String(source.ImageMode);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.LegacyCCR != null) {
            this.LegacyCCR = new Boolean(source.LegacyCCR);
        }
        if (source.FullImageUrl != null) {
            this.FullImageUrl = new String(source.FullImageUrl);
        }
        if (source.MainVersion != null) {
            this.MainVersion = new String(source.MainVersion);
        }
        if (source.RegistryUrl != null) {
            this.RegistryUrl = new String(source.RegistryUrl);
        }
        if (source.NamespaceName != null) {
            this.NamespaceName = new String(source.NamespaceName);
        }
        if (source.RepoName != null) {
            this.RepoName = new String(source.RepoName);
        }
        if (source.Tag != null) {
            this.Tag = new String(source.Tag);
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.ImagePullSecret != null) {
            this.ImagePullSecret = new ImagePullSecret(source.ImagePullSecret);
        }
        if (source.ImagePullPolicy != null) {
            this.ImagePullPolicy = new String(source.ImagePullPolicy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageMode", this.ImageMode);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "LegacyCCR", this.LegacyCCR);
        this.setParamSimple(map, prefix + "FullImageUrl", this.FullImageUrl);
        this.setParamSimple(map, prefix + "MainVersion", this.MainVersion);
        this.setParamSimple(map, prefix + "RegistryUrl", this.RegistryUrl);
        this.setParamSimple(map, prefix + "NamespaceName", this.NamespaceName);
        this.setParamSimple(map, prefix + "RepoName", this.RepoName);
        this.setParamSimple(map, prefix + "Tag", this.Tag);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamObj(map, prefix + "ImagePullSecret.", this.ImagePullSecret);
        this.setParamSimple(map, prefix + "ImagePullPolicy", this.ImagePullPolicy);

    }
}

