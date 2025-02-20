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

public class UpstreamRequestCookie extends AbstractModel {

    /**
    * Whether to enable the origin-pull request parameter cookie. valid values:.
<Li>`On`: enable;</li>
.
<Li>Off: disable.</li>.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Origin-Pull request parameter cookie mode. this parameter is required when `switch` is on. valid values are:.
<Li>Full: indicates full retention;</li>.
<Li>Ignore: ignore all.</li>.
<Li>`IncludeCustom`: retain partial parameters.</li>.
<Li>ExcludeCustom: ignore partial parameters.</li>.
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Specifies parameter values. this parameter takes effect only when the query string mode action is `includecustom` or `excludecustom`, and is used to specify the parameters to be reserved or ignored. up to 10 parameters are supported.
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
     * Get Whether to enable the origin-pull request parameter cookie. valid values:.
<Li>`On`: enable;</li>
.
<Li>Off: disable.</li>. 
     * @return Switch Whether to enable the origin-pull request parameter cookie. valid values:.
<Li>`On`: enable;</li>
.
<Li>Off: disable.</li>.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to enable the origin-pull request parameter cookie. valid values:.
<Li>`On`: enable;</li>
.
<Li>Off: disable.</li>.
     * @param Switch Whether to enable the origin-pull request parameter cookie. valid values:.
<Li>`On`: enable;</li>
.
<Li>Off: disable.</li>.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Origin-Pull request parameter cookie mode. this parameter is required when `switch` is on. valid values are:.
<Li>Full: indicates full retention;</li>.
<Li>Ignore: ignore all.</li>.
<Li>`IncludeCustom`: retain partial parameters.</li>.
<Li>ExcludeCustom: ignore partial parameters.</li>. 
     * @return Action Origin-Pull request parameter cookie mode. this parameter is required when `switch` is on. valid values are:.
<Li>Full: indicates full retention;</li>.
<Li>Ignore: ignore all.</li>.
<Li>`IncludeCustom`: retain partial parameters.</li>.
<Li>ExcludeCustom: ignore partial parameters.</li>.
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Origin-Pull request parameter cookie mode. this parameter is required when `switch` is on. valid values are:.
<Li>Full: indicates full retention;</li>.
<Li>Ignore: ignore all.</li>.
<Li>`IncludeCustom`: retain partial parameters.</li>.
<Li>ExcludeCustom: ignore partial parameters.</li>.
     * @param Action Origin-Pull request parameter cookie mode. this parameter is required when `switch` is on. valid values are:.
<Li>Full: indicates full retention;</li>.
<Li>Ignore: ignore all.</li>.
<Li>`IncludeCustom`: retain partial parameters.</li>.
<Li>ExcludeCustom: ignore partial parameters.</li>.
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Specifies parameter values. this parameter takes effect only when the query string mode action is `includecustom` or `excludecustom`, and is used to specify the parameters to be reserved or ignored. up to 10 parameters are supported. 
     * @return Values Specifies parameter values. this parameter takes effect only when the query string mode action is `includecustom` or `excludecustom`, and is used to specify the parameters to be reserved or ignored. up to 10 parameters are supported.
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set Specifies parameter values. this parameter takes effect only when the query string mode action is `includecustom` or `excludecustom`, and is used to specify the parameters to be reserved or ignored. up to 10 parameters are supported.
     * @param Values Specifies parameter values. this parameter takes effect only when the query string mode action is `includecustom` or `excludecustom`, and is used to specify the parameters to be reserved or ignored. up to 10 parameters are supported.
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    public UpstreamRequestCookie() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpstreamRequestCookie(UpstreamRequestCookie source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);

    }
}

