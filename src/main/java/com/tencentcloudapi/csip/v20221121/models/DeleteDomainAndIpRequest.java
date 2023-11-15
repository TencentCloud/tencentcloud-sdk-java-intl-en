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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteDomainAndIpRequest extends AbstractModel {

    /**
    * u200c-
    */
    @SerializedName("Content")
    @Expose
    private PublicIpDomainListKey [] Content;

    /**
    * Whether to retain the path configuration. `1`: Retain; Others: Do not retain. It defaults to do not retain if not specified.
    */
    @SerializedName("RetainPath")
    @Expose
    private Long RetainPath;

    /**
    * Whether to ignore this asset in the future. `1`: Ignore; Others: Do not ignore. It defaults to ignore if not specified.
    */
    @SerializedName("IgnoreAsset")
    @Expose
    private Long IgnoreAsset;

    /**
    * Asset tags
    */
    @SerializedName("Tags")
    @Expose
    private AssetTag [] Tags;

    /**
    * Deletion mode. Values: `ALL` (delete all). If it's not specified, `Content` is required.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get u200c- 
     * @return Content u200c-
     */
    public PublicIpDomainListKey [] getContent() {
        return this.Content;
    }

    /**
     * Set u200c-
     * @param Content u200c-
     */
    public void setContent(PublicIpDomainListKey [] Content) {
        this.Content = Content;
    }

    /**
     * Get Whether to retain the path configuration. `1`: Retain; Others: Do not retain. It defaults to do not retain if not specified. 
     * @return RetainPath Whether to retain the path configuration. `1`: Retain; Others: Do not retain. It defaults to do not retain if not specified.
     */
    public Long getRetainPath() {
        return this.RetainPath;
    }

    /**
     * Set Whether to retain the path configuration. `1`: Retain; Others: Do not retain. It defaults to do not retain if not specified.
     * @param RetainPath Whether to retain the path configuration. `1`: Retain; Others: Do not retain. It defaults to do not retain if not specified.
     */
    public void setRetainPath(Long RetainPath) {
        this.RetainPath = RetainPath;
    }

    /**
     * Get Whether to ignore this asset in the future. `1`: Ignore; Others: Do not ignore. It defaults to ignore if not specified. 
     * @return IgnoreAsset Whether to ignore this asset in the future. `1`: Ignore; Others: Do not ignore. It defaults to ignore if not specified.
     */
    public Long getIgnoreAsset() {
        return this.IgnoreAsset;
    }

    /**
     * Set Whether to ignore this asset in the future. `1`: Ignore; Others: Do not ignore. It defaults to ignore if not specified.
     * @param IgnoreAsset Whether to ignore this asset in the future. `1`: Ignore; Others: Do not ignore. It defaults to ignore if not specified.
     */
    public void setIgnoreAsset(Long IgnoreAsset) {
        this.IgnoreAsset = IgnoreAsset;
    }

    /**
     * Get Asset tags 
     * @return Tags Asset tags
     */
    public AssetTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Asset tags
     * @param Tags Asset tags
     */
    public void setTags(AssetTag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Deletion mode. Values: `ALL` (delete all). If it's not specified, `Content` is required. 
     * @return Type Deletion mode. Values: `ALL` (delete all). If it's not specified, `Content` is required.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Deletion mode. Values: `ALL` (delete all). If it's not specified, `Content` is required.
     * @param Type Deletion mode. Values: `ALL` (delete all). If it's not specified, `Content` is required.
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
        this.setParamArrayObj(map, prefix + "Content.", this.Content);
        this.setParamSimple(map, prefix + "RetainPath", this.RetainPath);
        this.setParamSimple(map, prefix + "IgnoreAsset", this.IgnoreAsset);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

