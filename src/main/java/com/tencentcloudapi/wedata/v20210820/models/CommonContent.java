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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CommonContent extends AbstractModel {

    /**
    * Detailed Content
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get Detailed Content
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Content Detailed Content
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Detailed Content
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Content Detailed Content
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    public CommonContent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CommonContent(CommonContent source) {
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}

