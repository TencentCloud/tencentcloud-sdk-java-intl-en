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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageOptimization extends AbstractModel {

    /**
    * `WebpAdapter` configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("WebpAdapter")
    @Expose
    private WebpAdapter WebpAdapter;

    /**
    * `TpgAdapter` configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("TpgAdapter")
    @Expose
    private TpgAdapter TpgAdapter;

    /**
    * `GuetzliAdapter` configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("GuetzliAdapter")
    @Expose
    private GuetzliAdapter GuetzliAdapter;

    /**
    * AVIF adapter configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("AvifAdapter")
    @Expose
    private AvifAdapter AvifAdapter;

    /**
     * Get `WebpAdapter` configuration
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return WebpAdapter `WebpAdapter` configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public WebpAdapter getWebpAdapter() {
        return this.WebpAdapter;
    }

    /**
     * Set `WebpAdapter` configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param WebpAdapter `WebpAdapter` configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setWebpAdapter(WebpAdapter WebpAdapter) {
        this.WebpAdapter = WebpAdapter;
    }

    /**
     * Get `TpgAdapter` configuration
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return TpgAdapter `TpgAdapter` configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public TpgAdapter getTpgAdapter() {
        return this.TpgAdapter;
    }

    /**
     * Set `TpgAdapter` configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param TpgAdapter `TpgAdapter` configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setTpgAdapter(TpgAdapter TpgAdapter) {
        this.TpgAdapter = TpgAdapter;
    }

    /**
     * Get `GuetzliAdapter` configuration
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return GuetzliAdapter `GuetzliAdapter` configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public GuetzliAdapter getGuetzliAdapter() {
        return this.GuetzliAdapter;
    }

    /**
     * Set `GuetzliAdapter` configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param GuetzliAdapter `GuetzliAdapter` configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setGuetzliAdapter(GuetzliAdapter GuetzliAdapter) {
        this.GuetzliAdapter = GuetzliAdapter;
    }

    /**
     * Get AVIF adapter configuration
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return AvifAdapter AVIF adapter configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public AvifAdapter getAvifAdapter() {
        return this.AvifAdapter;
    }

    /**
     * Set AVIF adapter configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param AvifAdapter AVIF adapter configuration
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setAvifAdapter(AvifAdapter AvifAdapter) {
        this.AvifAdapter = AvifAdapter;
    }

    public ImageOptimization() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageOptimization(ImageOptimization source) {
        if (source.WebpAdapter != null) {
            this.WebpAdapter = new WebpAdapter(source.WebpAdapter);
        }
        if (source.TpgAdapter != null) {
            this.TpgAdapter = new TpgAdapter(source.TpgAdapter);
        }
        if (source.GuetzliAdapter != null) {
            this.GuetzliAdapter = new GuetzliAdapter(source.GuetzliAdapter);
        }
        if (source.AvifAdapter != null) {
            this.AvifAdapter = new AvifAdapter(source.AvifAdapter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "WebpAdapter.", this.WebpAdapter);
        this.setParamObj(map, prefix + "TpgAdapter.", this.TpgAdapter);
        this.setParamObj(map, prefix + "GuetzliAdapter.", this.GuetzliAdapter);
        this.setParamObj(map, prefix + "AvifAdapter.", this.AvifAdapter);

    }
}

