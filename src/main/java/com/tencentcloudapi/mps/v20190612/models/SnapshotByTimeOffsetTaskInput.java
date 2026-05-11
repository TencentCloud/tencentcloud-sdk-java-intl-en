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

public class SnapshotByTimeOffsetTaskInput extends AbstractModel {

    /**
    * <p>Time point screenshot template ID.</p>
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <p>List of screenshot time points. Time points support two formats: s and %.</p><li>The unit for a string that ends with s is second. For example, 3.5s means the time point is at 3.5 seconds.</li><li>The unit for a string that ends with % is a percentage of the video duration. For example, 10% means the time point is at 10% of the video's total duration.</li>
    */
    @SerializedName("ExtTimeOffsetSet")
    @Expose
    private String [] ExtTimeOffsetSet;

    /**
    * <p>List of screenshot time points, in <font color="red">seconds</font>. This parameter is not recommended. We recommend that you use the ExtTimeOffsetSet parameter.</p>
    */
    @SerializedName("TimeOffsetSet")
    @Expose
    private Float [] TimeOffsetSet;

    /**
    * <p>Watermark list. Up to 10 image or text watermarks are supported.</p>
    */
    @SerializedName("WatermarkSet")
    @Expose
    private WatermarkInput [] WatermarkSet;

    /**
    * <p>Target storage for the file after the time point screenshot is taken. If this is not specified, it inherits the value from the upper-level OutputStorage.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
    * <p>Output path of the image file after the time point screenshot is taken, which can be a relative or absolute path.<br>To define the output path, the path must end with <code>.{format}</code>. For variable names, see <a href="https://www.tencentcloud.com/document/product/862/37039?from_cn_redirect=1">File Name Variable Description</a>.<br>Relative path example:</p><li>File name_{variable name}.{format}</li><li>File name.{format}</li>Absolute path example:<li>/custom path/file name_{variable name}.{format}</li>If this is not specified, the default relative path is <code>{inputName}_snapshotByTimeOffset_{definition}_{number}.{format}</code>.
    */
    @SerializedName("OutputObjectPath")
    @Expose
    private String OutputObjectPath;

    /**
    * <p>Rule of the <code>{number}</code> variable in the output path after the time point screenshot is taken.</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ObjectNumberFormat")
    @Expose
    private NumberFormat ObjectNumberFormat;

    /**
    * <p>Extended parameter.</p>
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
     * Get <p>Time point screenshot template ID.</p> 
     * @return Definition <p>Time point screenshot template ID.</p>
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set <p>Time point screenshot template ID.</p>
     * @param Definition <p>Time point screenshot template ID.</p>
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get <p>List of screenshot time points. Time points support two formats: s and %.</p><li>The unit for a string that ends with s is second. For example, 3.5s means the time point is at 3.5 seconds.</li><li>The unit for a string that ends with % is a percentage of the video duration. For example, 10% means the time point is at 10% of the video's total duration.</li> 
     * @return ExtTimeOffsetSet <p>List of screenshot time points. Time points support two formats: s and %.</p><li>The unit for a string that ends with s is second. For example, 3.5s means the time point is at 3.5 seconds.</li><li>The unit for a string that ends with % is a percentage of the video duration. For example, 10% means the time point is at 10% of the video's total duration.</li>
     */
    public String [] getExtTimeOffsetSet() {
        return this.ExtTimeOffsetSet;
    }

    /**
     * Set <p>List of screenshot time points. Time points support two formats: s and %.</p><li>The unit for a string that ends with s is second. For example, 3.5s means the time point is at 3.5 seconds.</li><li>The unit for a string that ends with % is a percentage of the video duration. For example, 10% means the time point is at 10% of the video's total duration.</li>
     * @param ExtTimeOffsetSet <p>List of screenshot time points. Time points support two formats: s and %.</p><li>The unit for a string that ends with s is second. For example, 3.5s means the time point is at 3.5 seconds.</li><li>The unit for a string that ends with % is a percentage of the video duration. For example, 10% means the time point is at 10% of the video's total duration.</li>
     */
    public void setExtTimeOffsetSet(String [] ExtTimeOffsetSet) {
        this.ExtTimeOffsetSet = ExtTimeOffsetSet;
    }

    /**
     * Get <p>List of screenshot time points, in <font color="red">seconds</font>. This parameter is not recommended. We recommend that you use the ExtTimeOffsetSet parameter.</p> 
     * @return TimeOffsetSet <p>List of screenshot time points, in <font color="red">seconds</font>. This parameter is not recommended. We recommend that you use the ExtTimeOffsetSet parameter.</p>
     */
    public Float [] getTimeOffsetSet() {
        return this.TimeOffsetSet;
    }

    /**
     * Set <p>List of screenshot time points, in <font color="red">seconds</font>. This parameter is not recommended. We recommend that you use the ExtTimeOffsetSet parameter.</p>
     * @param TimeOffsetSet <p>List of screenshot time points, in <font color="red">seconds</font>. This parameter is not recommended. We recommend that you use the ExtTimeOffsetSet parameter.</p>
     */
    public void setTimeOffsetSet(Float [] TimeOffsetSet) {
        this.TimeOffsetSet = TimeOffsetSet;
    }

    /**
     * Get <p>Watermark list. Up to 10 image or text watermarks are supported.</p> 
     * @return WatermarkSet <p>Watermark list. Up to 10 image or text watermarks are supported.</p>
     */
    public WatermarkInput [] getWatermarkSet() {
        return this.WatermarkSet;
    }

    /**
     * Set <p>Watermark list. Up to 10 image or text watermarks are supported.</p>
     * @param WatermarkSet <p>Watermark list. Up to 10 image or text watermarks are supported.</p>
     */
    public void setWatermarkSet(WatermarkInput [] WatermarkSet) {
        this.WatermarkSet = WatermarkSet;
    }

    /**
     * Get <p>Target storage for the file after the time point screenshot is taken. If this is not specified, it inherits the value from the upper-level OutputStorage.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OutputStorage <p>Target storage for the file after the time point screenshot is taken. If this is not specified, it inherits the value from the upper-level OutputStorage.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set <p>Target storage for the file after the time point screenshot is taken. If this is not specified, it inherits the value from the upper-level OutputStorage.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OutputStorage <p>Target storage for the file after the time point screenshot is taken. If this is not specified, it inherits the value from the upper-level OutputStorage.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    /**
     * Get <p>Output path of the image file after the time point screenshot is taken, which can be a relative or absolute path.<br>To define the output path, the path must end with <code>.{format}</code>. For variable names, see <a href="https://www.tencentcloud.com/document/product/862/37039?from_cn_redirect=1">File Name Variable Description</a>.<br>Relative path example:</p><li>File name_{variable name}.{format}</li><li>File name.{format}</li>Absolute path example:<li>/custom path/file name_{variable name}.{format}</li>If this is not specified, the default relative path is <code>{inputName}_snapshotByTimeOffset_{definition}_{number}.{format}</code>. 
     * @return OutputObjectPath <p>Output path of the image file after the time point screenshot is taken, which can be a relative or absolute path.<br>To define the output path, the path must end with <code>.{format}</code>. For variable names, see <a href="https://www.tencentcloud.com/document/product/862/37039?from_cn_redirect=1">File Name Variable Description</a>.<br>Relative path example:</p><li>File name_{variable name}.{format}</li><li>File name.{format}</li>Absolute path example:<li>/custom path/file name_{variable name}.{format}</li>If this is not specified, the default relative path is <code>{inputName}_snapshotByTimeOffset_{definition}_{number}.{format}</code>.
     */
    public String getOutputObjectPath() {
        return this.OutputObjectPath;
    }

    /**
     * Set <p>Output path of the image file after the time point screenshot is taken, which can be a relative or absolute path.<br>To define the output path, the path must end with <code>.{format}</code>. For variable names, see <a href="https://www.tencentcloud.com/document/product/862/37039?from_cn_redirect=1">File Name Variable Description</a>.<br>Relative path example:</p><li>File name_{variable name}.{format}</li><li>File name.{format}</li>Absolute path example:<li>/custom path/file name_{variable name}.{format}</li>If this is not specified, the default relative path is <code>{inputName}_snapshotByTimeOffset_{definition}_{number}.{format}</code>.
     * @param OutputObjectPath <p>Output path of the image file after the time point screenshot is taken, which can be a relative or absolute path.<br>To define the output path, the path must end with <code>.{format}</code>. For variable names, see <a href="https://www.tencentcloud.com/document/product/862/37039?from_cn_redirect=1">File Name Variable Description</a>.<br>Relative path example:</p><li>File name_{variable name}.{format}</li><li>File name.{format}</li>Absolute path example:<li>/custom path/file name_{variable name}.{format}</li>If this is not specified, the default relative path is <code>{inputName}_snapshotByTimeOffset_{definition}_{number}.{format}</code>.
     */
    public void setOutputObjectPath(String OutputObjectPath) {
        this.OutputObjectPath = OutputObjectPath;
    }

    /**
     * Get <p>Rule of the <code>{number}</code> variable in the output path after the time point screenshot is taken.</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ObjectNumberFormat <p>Rule of the <code>{number}</code> variable in the output path after the time point screenshot is taken.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public NumberFormat getObjectNumberFormat() {
        return this.ObjectNumberFormat;
    }

    /**
     * Set <p>Rule of the <code>{number}</code> variable in the output path after the time point screenshot is taken.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ObjectNumberFormat <p>Rule of the <code>{number}</code> variable in the output path after the time point screenshot is taken.</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setObjectNumberFormat(NumberFormat ObjectNumberFormat) {
        this.ObjectNumberFormat = ObjectNumberFormat;
    }

    /**
     * Get <p>Extended parameter.</p> 
     * @return ExtInfo <p>Extended parameter.</p>
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set <p>Extended parameter.</p>
     * @param ExtInfo <p>Extended parameter.</p>
     */
    public void setExtInfo(String ExtInfo) {
        this.ExtInfo = ExtInfo;
    }

    public SnapshotByTimeOffsetTaskInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SnapshotByTimeOffsetTaskInput(SnapshotByTimeOffsetTaskInput source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.ExtTimeOffsetSet != null) {
            this.ExtTimeOffsetSet = new String[source.ExtTimeOffsetSet.length];
            for (int i = 0; i < source.ExtTimeOffsetSet.length; i++) {
                this.ExtTimeOffsetSet[i] = new String(source.ExtTimeOffsetSet[i]);
            }
        }
        if (source.TimeOffsetSet != null) {
            this.TimeOffsetSet = new Float[source.TimeOffsetSet.length];
            for (int i = 0; i < source.TimeOffsetSet.length; i++) {
                this.TimeOffsetSet[i] = new Float(source.TimeOffsetSet[i]);
            }
        }
        if (source.WatermarkSet != null) {
            this.WatermarkSet = new WatermarkInput[source.WatermarkSet.length];
            for (int i = 0; i < source.WatermarkSet.length; i++) {
                this.WatermarkSet[i] = new WatermarkInput(source.WatermarkSet[i]);
            }
        }
        if (source.OutputStorage != null) {
            this.OutputStorage = new TaskOutputStorage(source.OutputStorage);
        }
        if (source.OutputObjectPath != null) {
            this.OutputObjectPath = new String(source.OutputObjectPath);
        }
        if (source.ObjectNumberFormat != null) {
            this.ObjectNumberFormat = new NumberFormat(source.ObjectNumberFormat);
        }
        if (source.ExtInfo != null) {
            this.ExtInfo = new String(source.ExtInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamArraySimple(map, prefix + "ExtTimeOffsetSet.", this.ExtTimeOffsetSet);
        this.setParamArraySimple(map, prefix + "TimeOffsetSet.", this.TimeOffsetSet);
        this.setParamArrayObj(map, prefix + "WatermarkSet.", this.WatermarkSet);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);
        this.setParamSimple(map, prefix + "OutputObjectPath", this.OutputObjectPath);
        this.setParamObj(map, prefix + "ObjectNumberFormat.", this.ObjectNumberFormat);
        this.setParamSimple(map, prefix + "ExtInfo", this.ExtInfo);

    }
}

