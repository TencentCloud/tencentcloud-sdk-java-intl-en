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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteDomainAndIpRequest extends AbstractModel {

    /**
    * Group Account Member ID
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * Asset
    */
    @SerializedName("Content")
    @Expose
    private PublicIpDomainListKey [] Content;

    /**
    * Whether to retain path configuration. 1: Yes; Other: No. No if not specified by default.
    */
    @SerializedName("RetainPath")
    @Expose
    private Long RetainPath;

    /**
    * Whether to ignore this asset in the future. 1: Yes; Other: No. No if not specified by default.
    */
    @SerializedName("IgnoreAsset")
    @Expose
    private Long IgnoreAsset;

    /**
    * Asset tag
    */
    @SerializedName("Tags")
    @Expose
    private AssetTag [] Tags;

    /**
    * Delete type. ALL: deleting all, which will directly ignore the content of Content; Other value: not all, and Content is required. Other value by default.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get Group Account Member ID 
     * @return MemberId Group Account Member ID
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set Group Account Member ID
     * @param MemberId Group Account Member ID
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get Asset 
     * @return Content Asset
     */
    public PublicIpDomainListKey [] getContent() {
        return this.Content;
    }

    /**
     * Set Asset
     * @param Content Asset
     */
    public void setContent(PublicIpDomainListKey [] Content) {
        this.Content = Content;
    }

    /**
     * Get Whether to retain path configuration. 1: Yes; Other: No. No if not specified by default. 
     * @return RetainPath Whether to retain path configuration. 1: Yes; Other: No. No if not specified by default.
     */
    public Long getRetainPath() {
        return this.RetainPath;
    }

    /**
     * Set Whether to retain path configuration. 1: Yes; Other: No. No if not specified by default.
     * @param RetainPath Whether to retain path configuration. 1: Yes; Other: No. No if not specified by default.
     */
    public void setRetainPath(Long RetainPath) {
        this.RetainPath = RetainPath;
    }

    /**
     * Get Whether to ignore this asset in the future. 1: Yes; Other: No. No if not specified by default. 
     * @return IgnoreAsset Whether to ignore this asset in the future. 1: Yes; Other: No. No if not specified by default.
     */
    public Long getIgnoreAsset() {
        return this.IgnoreAsset;
    }

    /**
     * Set Whether to ignore this asset in the future. 1: Yes; Other: No. No if not specified by default.
     * @param IgnoreAsset Whether to ignore this asset in the future. 1: Yes; Other: No. No if not specified by default.
     */
    public void setIgnoreAsset(Long IgnoreAsset) {
        this.IgnoreAsset = IgnoreAsset;
    }

    /**
     * Get Asset tag 
     * @return Tags Asset tag
     */
    public AssetTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Asset tag
     * @param Tags Asset tag
     */
    public void setTags(AssetTag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Delete type. ALL: deleting all, which will directly ignore the content of Content; Other value: not all, and Content is required. Other value by default. 
     * @return Type Delete type. ALL: deleting all, which will directly ignore the content of Content; Other value: not all, and Content is required. Other value by default.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Delete type. ALL: deleting all, which will directly ignore the content of Content; Other value: not all, and Content is required. Other value by default.
     * @param Type Delete type. ALL: deleting all, which will directly ignore the content of Content; Other value: not all, and Content is required. Other value by default.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public DeleteDomainAndIpRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteDomainAndIpRequest(DeleteDomainAndIpRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Content != null) {
            this.Content = new PublicIpDomainListKey[source.Content.length];
            for (int i = 0; i < source.Content.length; i++) {
                this.Content[i] = new PublicIpDomainListKey(source.Content[i]);
            }
        }
        if (source.RetainPath != null) {
            this.RetainPath = new Long(source.RetainPath);
        }
        if (source.IgnoreAsset != null) {
            this.IgnoreAsset = new Long(source.IgnoreAsset);
        }
        if (source.Tags != null) {
            this.Tags = new AssetTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new AssetTag(source.Tags[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArrayObj(map, prefix + "Content.", this.Content);
        this.setParamSimple(map, prefix + "RetainPath", this.RetainPath);
        this.setParamSimple(map, prefix + "IgnoreAsset", this.IgnoreAsset);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

