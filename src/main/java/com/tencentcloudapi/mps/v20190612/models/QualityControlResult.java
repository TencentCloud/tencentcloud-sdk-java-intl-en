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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QualityControlResult extends AbstractModel {

    /**
    * The issue type. Valid values:
`Jitter`
`Blur`
`LowLighting`
`HighLighting` (overexposure)
`CrashScreen` (video corruption)
`BlackWhiteEdge`
`SolidColorScreen` (blank screen)
`Noise`
`Mosaic` (pixelation)
`QRCode`
`AppletCode` (Weixin Mini Program code)
`BarCode`
`LowVoice`
`HighVoice`
`NoVoice`
`LowEvaluation` (low no-reference video quality score)
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * The information of a checked segment in quality control.
    */
    @SerializedName("QualityControlItems")
    @Expose
    private QualityControlItem [] QualityControlItems;

    /**
     * Get The issue type. Valid values:
`Jitter`
`Blur`
`LowLighting`
`HighLighting` (overexposure)
`CrashScreen` (video corruption)
`BlackWhiteEdge`
`SolidColorScreen` (blank screen)
`Noise`
`Mosaic` (pixelation)
`QRCode`
`AppletCode` (Weixin Mini Program code)
`BarCode`
`LowVoice`
`HighVoice`
`NoVoice`
`LowEvaluation` (low no-reference video quality score) 
     * @return Type The issue type. Valid values:
`Jitter`
`Blur`
`LowLighting`
`HighLighting` (overexposure)
`CrashScreen` (video corruption)
`BlackWhiteEdge`
`SolidColorScreen` (blank screen)
`Noise`
`Mosaic` (pixelation)
`QRCode`
`AppletCode` (Weixin Mini Program code)
`BarCode`
`LowVoice`
`HighVoice`
`NoVoice`
`LowEvaluation` (low no-reference video quality score)
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set The issue type. Valid values:
`Jitter`
`Blur`
`LowLighting`
`HighLighting` (overexposure)
`CrashScreen` (video corruption)
`BlackWhiteEdge`
`SolidColorScreen` (blank screen)
`Noise`
`Mosaic` (pixelation)
`QRCode`
`AppletCode` (Weixin Mini Program code)
`BarCode`
`LowVoice`
`HighVoice`
`NoVoice`
`LowEvaluation` (low no-reference video quality score)
     * @param Type The issue type. Valid values:
`Jitter`
`Blur`
`LowLighting`
`HighLighting` (overexposure)
`CrashScreen` (video corruption)
`BlackWhiteEdge`
`SolidColorScreen` (blank screen)
`Noise`
`Mosaic` (pixelation)
`QRCode`
`AppletCode` (Weixin Mini Program code)
`BarCode`
`LowVoice`
`HighVoice`
`NoVoice`
`LowEvaluation` (low no-reference video quality score)
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get The information of a checked segment in quality control. 
     * @return QualityControlItems The information of a checked segment in quality control.
     */
    public QualityControlItem [] getQualityControlItems() {
        return this.QualityControlItems;
    }

    /**
     * Set The information of a checked segment in quality control.
     * @param QualityControlItems The information of a checked segment in quality control.
     */
    public void setQualityControlItems(QualityControlItem [] QualityControlItems) {
        this.QualityControlItems = QualityControlItems;
    }

    public QualityControlResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QualityControlResult(QualityControlResult source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.QualityControlItems != null) {
            this.QualityControlItems = new QualityControlItem[source.QualityControlItems.length];
            for (int i = 0; i < source.QualityControlItems.length; i++) {
                this.QualityControlItems[i] = new QualityControlItem(source.QualityControlItems[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "QualityControlItems.", this.QualityControlItems);

    }
}

