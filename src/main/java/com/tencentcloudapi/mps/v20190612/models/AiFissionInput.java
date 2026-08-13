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

public class AiFissionInput extends AbstractModel {

    /**
    * <p>Video fission reference image url</p>
    */
    @SerializedName("ImageUrls")
    @Expose
    private String [] ImageUrls;

    /**
    * <p>Video fission product information reference copywriting</p>
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
     * Get <p>Video fission reference image url</p> 
     * @return ImageUrls <p>Video fission reference image url</p>
     */
    public String [] getImageUrls() {
        return this.ImageUrls;
    }

    /**
     * Set <p>Video fission reference image url</p>
     * @param ImageUrls <p>Video fission reference image url</p>
     */
    public void setImageUrls(String [] ImageUrls) {
        this.ImageUrls = ImageUrls;
    }

    /**
     * Get <p>Video fission product information reference copywriting</p> 
     * @return Text <p>Video fission product information reference copywriting</p>
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set <p>Video fission product information reference copywriting</p>
     * @param Text <p>Video fission product information reference copywriting</p>
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    public AiFissionInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiFissionInput(AiFissionInput source) {
        if (source.ImageUrls != null) {
            this.ImageUrls = new String[source.ImageUrls.length];
            for (int i = 0; i < source.ImageUrls.length; i++) {
                this.ImageUrls[i] = new String(source.ImageUrls[i]);
            }
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ImageUrls.", this.ImageUrls);
        this.setParamSimple(map, prefix + "Text", this.Text);

    }
}

