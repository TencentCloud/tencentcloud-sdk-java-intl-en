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

public class AIDubbingTaskInput extends AbstractModel {

    /**
    * <p>AI Dubbing template id.</p>
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <p>Custom AI dubbing parameter. It takes effect when Definition is set to 0. This parameter is used in highly customized scenarios. We recommend that you use Definition to specify dubbing parameters.</p>
    */
    @SerializedName("RawParameter")
    @Expose
    private RawAIDubbingParameter RawParameter;

    /**
    * <p>AI Dubbing custom parameters. Valid when Definition is not filled with 0. When some dubbing parameters in this structure are filled in, the filled parameters will be used to override the parameters in the AI Dubbing template. This parameter is used for highly customized scenarios. We recommend you use only Definition to specify dubbing parameters.</p>
    */
    @SerializedName("OverrideParameter")
    @Expose
    private OverrideAIDubbingParameter OverrideParameter;

    /**
    * <p>Target storage for the file. If this is not specified, it inherits the value from the upper-level OutputStorage.</p>
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
    * <p>External source subtitle file information.</p>
    */
    @SerializedName("SrcSubtitleInfo")
    @Expose
    private MediaInputInfo SrcSubtitleInfo;

    /**
    * <p>External subtitle file information, translated subtitles.</p>
    */
    @SerializedName("DstSubtitleInfos")
    @Expose
    private DstSubtitleInput [] DstSubtitleInfos;

    /**
    * <p>Output path of the file, which can be a relative or absolute path.<br>To define the output path, the path must end with <code>.{format}</code>. For variable names, see <a href="https://www.tencentcloud.com/document/product/862/37039?from_cn_redirect=1">File Name Variable Description</a>.<br>Relative path example:</p><li>File name_{variable name}.{format}</li><li>File name.{format}</li>Absolute path example:<li>/custom path/file name_{variable name}.{format}</li><p><strong>Note</strong>: The <code>BatchProcessMedia</code> API is currently not supported.</p>
    */
    @SerializedName("OutputObjectPath")
    @Expose
    private String OutputObjectPath;

    /**
    * <p>Additional parameters for AI Dubbing, serialized json string.</p>
    */
    @SerializedName("ExtendedParameter")
    @Expose
    private String ExtendedParameter;

    /**
    * <p>ID of the associated drama series.<br>Note: This value takes effect when dubbing mode is intelligent dubbing by role.</p>
    */
    @SerializedName("DramaId")
    @Expose
    private String DramaId;

    /**
     * Get <p>AI Dubbing template id.</p> 
     * @return Definition <p>AI Dubbing template id.</p>
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set <p>AI Dubbing template id.</p>
     * @param Definition <p>AI Dubbing template id.</p>
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get <p>Custom AI dubbing parameter. It takes effect when Definition is set to 0. This parameter is used in highly customized scenarios. We recommend that you use Definition to specify dubbing parameters.</p> 
     * @return RawParameter <p>Custom AI dubbing parameter. It takes effect when Definition is set to 0. This parameter is used in highly customized scenarios. We recommend that you use Definition to specify dubbing parameters.</p>
     */
    public RawAIDubbingParameter getRawParameter() {
        return this.RawParameter;
    }

    /**
     * Set <p>Custom AI dubbing parameter. It takes effect when Definition is set to 0. This parameter is used in highly customized scenarios. We recommend that you use Definition to specify dubbing parameters.</p>
     * @param RawParameter <p>Custom AI dubbing parameter. It takes effect when Definition is set to 0. This parameter is used in highly customized scenarios. We recommend that you use Definition to specify dubbing parameters.</p>
     */
    public void setRawParameter(RawAIDubbingParameter RawParameter) {
        this.RawParameter = RawParameter;
    }

    /**
     * Get <p>AI Dubbing custom parameters. Valid when Definition is not filled with 0. When some dubbing parameters in this structure are filled in, the filled parameters will be used to override the parameters in the AI Dubbing template. This parameter is used for highly customized scenarios. We recommend you use only Definition to specify dubbing parameters.</p> 
     * @return OverrideParameter <p>AI Dubbing custom parameters. Valid when Definition is not filled with 0. When some dubbing parameters in this structure are filled in, the filled parameters will be used to override the parameters in the AI Dubbing template. This parameter is used for highly customized scenarios. We recommend you use only Definition to specify dubbing parameters.</p>
     */
    public OverrideAIDubbingParameter getOverrideParameter() {
        return this.OverrideParameter;
    }

    /**
     * Set <p>AI Dubbing custom parameters. Valid when Definition is not filled with 0. When some dubbing parameters in this structure are filled in, the filled parameters will be used to override the parameters in the AI Dubbing template. This parameter is used for highly customized scenarios. We recommend you use only Definition to specify dubbing parameters.</p>
     * @param OverrideParameter <p>AI Dubbing custom parameters. Valid when Definition is not filled with 0. When some dubbing parameters in this structure are filled in, the filled parameters will be used to override the parameters in the AI Dubbing template. This parameter is used for highly customized scenarios. We recommend you use only Definition to specify dubbing parameters.</p>
     */
    public void setOverrideParameter(OverrideAIDubbingParameter OverrideParameter) {
        this.OverrideParameter = OverrideParameter;
    }

    /**
     * Get <p>Target storage for the file. If this is not specified, it inherits the value from the upper-level OutputStorage.</p> 
     * @return OutputStorage <p>Target storage for the file. If this is not specified, it inherits the value from the upper-level OutputStorage.</p>
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set <p>Target storage for the file. If this is not specified, it inherits the value from the upper-level OutputStorage.</p>
     * @param OutputStorage <p>Target storage for the file. If this is not specified, it inherits the value from the upper-level OutputStorage.</p>
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    /**
     * Get <p>External source subtitle file information.</p> 
     * @return SrcSubtitleInfo <p>External source subtitle file information.</p>
     */
    public MediaInputInfo getSrcSubtitleInfo() {
        return this.SrcSubtitleInfo;
    }

    /**
     * Set <p>External source subtitle file information.</p>
     * @param SrcSubtitleInfo <p>External source subtitle file information.</p>
     */
    public void setSrcSubtitleInfo(MediaInputInfo SrcSubtitleInfo) {
        this.SrcSubtitleInfo = SrcSubtitleInfo;
    }

    /**
     * Get <p>External subtitle file information, translated subtitles.</p> 
     * @return DstSubtitleInfos <p>External subtitle file information, translated subtitles.</p>
     */
    public DstSubtitleInput [] getDstSubtitleInfos() {
        return this.DstSubtitleInfos;
    }

    /**
     * Set <p>External subtitle file information, translated subtitles.</p>
     * @param DstSubtitleInfos <p>External subtitle file information, translated subtitles.</p>
     */
    public void setDstSubtitleInfos(DstSubtitleInput [] DstSubtitleInfos) {
        this.DstSubtitleInfos = DstSubtitleInfos;
    }

    /**
     * Get <p>Output path of the file, which can be a relative or absolute path.<br>To define the output path, the path must end with <code>.{format}</code>. For variable names, see <a href="https://www.tencentcloud.com/document/product/862/37039?from_cn_redirect=1">File Name Variable Description</a>.<br>Relative path example:</p><li>File name_{variable name}.{format}</li><li>File name.{format}</li>Absolute path example:<li>/custom path/file name_{variable name}.{format}</li><p><strong>Note</strong>: The <code>BatchProcessMedia</code> API is currently not supported.</p> 
     * @return OutputObjectPath <p>Output path of the file, which can be a relative or absolute path.<br>To define the output path, the path must end with <code>.{format}</code>. For variable names, see <a href="https://www.tencentcloud.com/document/product/862/37039?from_cn_redirect=1">File Name Variable Description</a>.<br>Relative path example:</p><li>File name_{variable name}.{format}</li><li>File name.{format}</li>Absolute path example:<li>/custom path/file name_{variable name}.{format}</li><p><strong>Note</strong>: The <code>BatchProcessMedia</code> API is currently not supported.</p>
     */
    public String getOutputObjectPath() {
        return this.OutputObjectPath;
    }

    /**
     * Set <p>Output path of the file, which can be a relative or absolute path.<br>To define the output path, the path must end with <code>.{format}</code>. For variable names, see <a href="https://www.tencentcloud.com/document/product/862/37039?from_cn_redirect=1">File Name Variable Description</a>.<br>Relative path example:</p><li>File name_{variable name}.{format}</li><li>File name.{format}</li>Absolute path example:<li>/custom path/file name_{variable name}.{format}</li><p><strong>Note</strong>: The <code>BatchProcessMedia</code> API is currently not supported.</p>
     * @param OutputObjectPath <p>Output path of the file, which can be a relative or absolute path.<br>To define the output path, the path must end with <code>.{format}</code>. For variable names, see <a href="https://www.tencentcloud.com/document/product/862/37039?from_cn_redirect=1">File Name Variable Description</a>.<br>Relative path example:</p><li>File name_{variable name}.{format}</li><li>File name.{format}</li>Absolute path example:<li>/custom path/file name_{variable name}.{format}</li><p><strong>Note</strong>: The <code>BatchProcessMedia</code> API is currently not supported.</p>
     */
    public void setOutputObjectPath(String OutputObjectPath) {
        this.OutputObjectPath = OutputObjectPath;
    }

    /**
     * Get <p>Additional parameters for AI Dubbing, serialized json string.</p> 
     * @return ExtendedParameter <p>Additional parameters for AI Dubbing, serialized json string.</p>
     */
    public String getExtendedParameter() {
        return this.ExtendedParameter;
    }

    /**
     * Set <p>Additional parameters for AI Dubbing, serialized json string.</p>
     * @param ExtendedParameter <p>Additional parameters for AI Dubbing, serialized json string.</p>
     */
    public void setExtendedParameter(String ExtendedParameter) {
        this.ExtendedParameter = ExtendedParameter;
    }

    /**
     * Get <p>ID of the associated drama series.<br>Note: This value takes effect when dubbing mode is intelligent dubbing by role.</p> 
     * @return DramaId <p>ID of the associated drama series.<br>Note: This value takes effect when dubbing mode is intelligent dubbing by role.</p>
     */
    public String getDramaId() {
        return this.DramaId;
    }

    /**
     * Set <p>ID of the associated drama series.<br>Note: This value takes effect when dubbing mode is intelligent dubbing by role.</p>
     * @param DramaId <p>ID of the associated drama series.<br>Note: This value takes effect when dubbing mode is intelligent dubbing by role.</p>
     */
    public void setDramaId(String DramaId) {
        this.DramaId = DramaId;
    }

    public AIDubbingTaskInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIDubbingTaskInput(AIDubbingTaskInput source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.RawParameter != null) {
            this.RawParameter = new RawAIDubbingParameter(source.RawParameter);
        }
        if (source.OverrideParameter != null) {
            this.OverrideParameter = new OverrideAIDubbingParameter(source.OverrideParameter);
        }
        if (source.OutputStorage != null) {
            this.OutputStorage = new TaskOutputStorage(source.OutputStorage);
        }
        if (source.SrcSubtitleInfo != null) {
            this.SrcSubtitleInfo = new MediaInputInfo(source.SrcSubtitleInfo);
        }
        if (source.DstSubtitleInfos != null) {
            this.DstSubtitleInfos = new DstSubtitleInput[source.DstSubtitleInfos.length];
            for (int i = 0; i < source.DstSubtitleInfos.length; i++) {
                this.DstSubtitleInfos[i] = new DstSubtitleInput(source.DstSubtitleInfos[i]);
            }
        }
        if (source.OutputObjectPath != null) {
            this.OutputObjectPath = new String(source.OutputObjectPath);
        }
        if (source.ExtendedParameter != null) {
            this.ExtendedParameter = new String(source.ExtendedParameter);
        }
        if (source.DramaId != null) {
            this.DramaId = new String(source.DramaId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamObj(map, prefix + "RawParameter.", this.RawParameter);
        this.setParamObj(map, prefix + "OverrideParameter.", this.OverrideParameter);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);
        this.setParamObj(map, prefix + "SrcSubtitleInfo.", this.SrcSubtitleInfo);
        this.setParamArrayObj(map, prefix + "DstSubtitleInfos.", this.DstSubtitleInfos);
        this.setParamSimple(map, prefix + "OutputObjectPath", this.OutputObjectPath);
        this.setParamSimple(map, prefix + "ExtendedParameter", this.ExtendedParameter);
        this.setParamSimple(map, prefix + "DramaId", this.DramaId);

    }
}

