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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageOptimization extends AbstractModel{

    /**
    * `WebpAdapter` configuration
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WebpAdapter")
    @Expose
    private WebpAdapter WebpAdapter;

    /**
    * `TpgAdapter` configuration
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TpgAdapter")
    @Expose
    private TpgAdapter TpgAdapter;

    /**
    * `GuetzliAdapter` configuration
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GuetzliAdapter")
    @Expose
    private GuetzliAdapter GuetzliAdapter;

    /**
     * Get `WebpAdapter` configuration
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return WebpAdapter `WebpAdapter` configuration
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public WebpAdapter getWebpAdapter() {
        return this.WebpAdapter;
    }

    /**
     * Set `WebpAdapter` configuration
Note: this field may return null, indicating that no valid values can be obtained.
     * @param WebpAdapter `WebpAdapter` configuration
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setWebpAdapter(WebpAdapter WebpAdapter) {
        this.WebpAdapter = WebpAdapter;
    }

    /**
     * Get `TpgAdapter` configuration
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TpgAdapter `TpgAdapter` configuration
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public TpgAdapter getTpgAdapter() {
        return this.TpgAdapter;
    }

    /**
     * Set `TpgAdapter` configuration
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TpgAdapter `TpgAdapter` configuration
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTpgAdapter(TpgAdapter TpgAdapter) {
        this.TpgAdapter = TpgAdapter;
    }

    /**
     * Get `GuetzliAdapter` configuration
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return GuetzliAdapter `GuetzliAdapter` configuration
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public GuetzliAdapter getGuetzliAdapter() {
        return this.GuetzliAdapter;
    }

    /**
     * Set `GuetzliAdapter` configuration
Note: this field may return null, indicating that no valid values can be obtained.
     * @param GuetzliAdapter `GuetzliAdapter` configuration
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setGuetzliAdapter(GuetzliAdapter GuetzliAdapter) {
        this.GuetzliAdapter = GuetzliAdapter;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "WebpAdapter.", this.WebpAdapter);
        this.setParamObj(map, prefix + "TpgAdapter.", this.TpgAdapter);
        this.setParamObj(map, prefix + "GuetzliAdapter.", this.GuetzliAdapter);

    }
}

