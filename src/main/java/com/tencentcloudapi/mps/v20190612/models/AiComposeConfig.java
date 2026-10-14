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

public class AiComposeConfig extends AbstractModel {

    /**
    * <p>Capability configuration switch.</p><li>ON: Enable (default value);</li><li>OFF: Disable.</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * <p>Compose model. Available values: compose-1.0-lite (default value, can be omitted).</p>
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * <p>Canvas definition. Can be omitted: if omitted, the natural size of the layer with the minimum ZIndex (bottom layer) is used.</p>
    */
    @SerializedName("Canvas")
    @Expose
    private ImageComposeCanvas Canvas;

    /**
    * <p>Layer list, the unique source of layers. At least 1 layer and up to 20 layers.</p>
    */
    @SerializedName("Layers")
    @Expose
    private ImageComposeLayer [] Layers;

    /**
     * Get <p>Capability configuration switch.</p><li>ON: Enable (default value);</li><li>OFF: Disable.</li> 
     * @return Switch <p>Capability configuration switch.</p><li>ON: Enable (default value);</li><li>OFF: Disable.</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set <p>Capability configuration switch.</p><li>ON: Enable (default value);</li><li>OFF: Disable.</li>
     * @param Switch <p>Capability configuration switch.</p><li>ON: Enable (default value);</li><li>OFF: Disable.</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get <p>Compose model. Available values: compose-1.0-lite (default value, can be omitted).</p> 
     * @return Model <p>Compose model. Available values: compose-1.0-lite (default value, can be omitted).</p>
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set <p>Compose model. Available values: compose-1.0-lite (default value, can be omitted).</p>
     * @param Model <p>Compose model. Available values: compose-1.0-lite (default value, can be omitted).</p>
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get <p>Canvas definition. Can be omitted: if omitted, the natural size of the layer with the minimum ZIndex (bottom layer) is used.</p> 
     * @return Canvas <p>Canvas definition. Can be omitted: if omitted, the natural size of the layer with the minimum ZIndex (bottom layer) is used.</p>
     */
    public ImageComposeCanvas getCanvas() {
        return this.Canvas;
    }

    /**
     * Set <p>Canvas definition. Can be omitted: if omitted, the natural size of the layer with the minimum ZIndex (bottom layer) is used.</p>
     * @param Canvas <p>Canvas definition. Can be omitted: if omitted, the natural size of the layer with the minimum ZIndex (bottom layer) is used.</p>
     */
    public void setCanvas(ImageComposeCanvas Canvas) {
        this.Canvas = Canvas;
    }

    /**
     * Get <p>Layer list, the unique source of layers. At least 1 layer and up to 20 layers.</p> 
     * @return Layers <p>Layer list, the unique source of layers. At least 1 layer and up to 20 layers.</p>
     */
    public ImageComposeLayer [] getLayers() {
        return this.Layers;
    }

    /**
     * Set <p>Layer list, the unique source of layers. At least 1 layer and up to 20 layers.</p>
     * @param Layers <p>Layer list, the unique source of layers. At least 1 layer and up to 20 layers.</p>
     */
    public void setLayers(ImageComposeLayer [] Layers) {
        this.Layers = Layers;
    }

    public AiComposeConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiComposeConfig(AiComposeConfig source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.Canvas != null) {
            this.Canvas = new ImageComposeCanvas(source.Canvas);
        }
        if (source.Layers != null) {
            this.Layers = new ImageComposeLayer[source.Layers.length];
            for (int i = 0; i < source.Layers.length; i++) {
                this.Layers[i] = new ImageComposeLayer(source.Layers[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamObj(map, prefix + "Canvas.", this.Canvas);
        this.setParamArrayObj(map, prefix + "Layers.", this.Layers);

    }
}

