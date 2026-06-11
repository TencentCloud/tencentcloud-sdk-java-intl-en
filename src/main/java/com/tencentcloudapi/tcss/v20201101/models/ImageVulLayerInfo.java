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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageVulLayerInfo extends AbstractModel {

    /**
    * Layer ID
    */
    @SerializedName("LayerId")
    @Expose
    private String LayerId;

    /**
    * Layer CMD
    */
    @SerializedName("LayerCmd")
    @Expose
    private String LayerCmd;

    /**
     * Get Layer ID 
     * @return LayerId Layer ID
     */
    public String getLayerId() {
        return this.LayerId;
    }

    /**
     * Set Layer ID
     * @param LayerId Layer ID
     */
    public void setLayerId(String LayerId) {
        this.LayerId = LayerId;
    }

    /**
     * Get Layer CMD 
     * @return LayerCmd Layer CMD
     */
    public String getLayerCmd() {
        return this.LayerCmd;
    }

    /**
     * Set Layer CMD
     * @param LayerCmd Layer CMD
     */
    public void setLayerCmd(String LayerCmd) {
        this.LayerCmd = LayerCmd;
    }

    public ImageVulLayerInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageVulLayerInfo(ImageVulLayerInfo source) {
        if (source.LayerId != null) {
            this.LayerId = new String(source.LayerId);
        }
        if (source.LayerCmd != null) {
            this.LayerCmd = new String(source.LayerCmd);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LayerId", this.LayerId);
        this.setParamSimple(map, prefix + "LayerCmd", this.LayerCmd);

    }
}

