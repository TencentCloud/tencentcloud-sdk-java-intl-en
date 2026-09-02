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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ViewImage extends AbstractModel {

    /**
    * <p>View type</p><p>Enumeration values:</p><ul><li>front: Front view (required)</li><li>back: Back view</li><li>left: Left view</li><li>right: Right view</li><li>top: Top view</li><li>bottom: Bottom view</li><li>left_front: Left front 45°</li><li>right_front: Right front 45°</li></ul><p>MultiViewImages array length ≥ 2; must contain the front view; the same ViewType cannot be duplicated; each item must provide ViewImageUrl</p>
    */
    @SerializedName("ViewType")
    @Expose
    private String ViewType;

    /**
    * <p>Image URL (http/https)</p>
    */
    @SerializedName("ViewImageUrl")
    @Expose
    private String ViewImageUrl;

    /**
     * Get <p>View type</p><p>Enumeration values:</p><ul><li>front: Front view (required)</li><li>back: Back view</li><li>left: Left view</li><li>right: Right view</li><li>top: Top view</li><li>bottom: Bottom view</li><li>left_front: Left front 45°</li><li>right_front: Right front 45°</li></ul><p>MultiViewImages array length ≥ 2; must contain the front view; the same ViewType cannot be duplicated; each item must provide ViewImageUrl</p> 
     * @return ViewType <p>View type</p><p>Enumeration values:</p><ul><li>front: Front view (required)</li><li>back: Back view</li><li>left: Left view</li><li>right: Right view</li><li>top: Top view</li><li>bottom: Bottom view</li><li>left_front: Left front 45°</li><li>right_front: Right front 45°</li></ul><p>MultiViewImages array length ≥ 2; must contain the front view; the same ViewType cannot be duplicated; each item must provide ViewImageUrl</p>
     */
    public String getViewType() {
        return this.ViewType;
    }

    /**
     * Set <p>View type</p><p>Enumeration values:</p><ul><li>front: Front view (required)</li><li>back: Back view</li><li>left: Left view</li><li>right: Right view</li><li>top: Top view</li><li>bottom: Bottom view</li><li>left_front: Left front 45°</li><li>right_front: Right front 45°</li></ul><p>MultiViewImages array length ≥ 2; must contain the front view; the same ViewType cannot be duplicated; each item must provide ViewImageUrl</p>
     * @param ViewType <p>View type</p><p>Enumeration values:</p><ul><li>front: Front view (required)</li><li>back: Back view</li><li>left: Left view</li><li>right: Right view</li><li>top: Top view</li><li>bottom: Bottom view</li><li>left_front: Left front 45°</li><li>right_front: Right front 45°</li></ul><p>MultiViewImages array length ≥ 2; must contain the front view; the same ViewType cannot be duplicated; each item must provide ViewImageUrl</p>
     */
    public void setViewType(String ViewType) {
        this.ViewType = ViewType;
    }

    /**
     * Get <p>Image URL (http/https)</p> 
     * @return ViewImageUrl <p>Image URL (http/https)</p>
     */
    public String getViewImageUrl() {
        return this.ViewImageUrl;
    }

    /**
     * Set <p>Image URL (http/https)</p>
     * @param ViewImageUrl <p>Image URL (http/https)</p>
     */
    public void setViewImageUrl(String ViewImageUrl) {
        this.ViewImageUrl = ViewImageUrl;
    }

    public ViewImage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ViewImage(ViewImage source) {
        if (source.ViewType != null) {
            this.ViewType = new String(source.ViewType);
        }
        if (source.ViewImageUrl != null) {
            this.ViewImageUrl = new String(source.ViewImageUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ViewType", this.ViewType);
        this.setParamSimple(map, prefix + "ViewImageUrl", this.ViewImageUrl);

    }
}

