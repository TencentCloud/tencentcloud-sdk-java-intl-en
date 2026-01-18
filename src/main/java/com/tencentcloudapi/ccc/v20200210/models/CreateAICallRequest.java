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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAICallRequest extends AbstractModel {

    /**
    * Application ID (required) can be found at https://console.cloud.tencent.com/ccc.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Called number.
    */
    @SerializedName("Callee")
    @Expose
    private String Callee;

    /**
    * Model API protocol type. currently compatible with four protocol types:.

-OpenAI protocol (including GPT, hunyuan, DeepSeek, etc.): "OpenAI".
-Azure protocol: "azure".
-Specifies the "Minimax" protocol.
-Dify protocol: "dify".
    */
    @SerializedName("LLMType")
    @Expose
    private String LLMType;

    /**
    * Model API key, for authentication information, please refer to the respective model's official website

- OpenAI protocol: [GPT](https://help.openai.com/en/articles/4936850-where-do-i-find-my-openai-api-key), [DeepSeek](https://api-docs.deepseek.com/zh-cn/);

- Azure protocol: [Azure GPT](https://learn.microsoft.com/en-us/azure/ai-services/openai/chatgpt-quickstart?tabs=command-line%2Ctypescript%2Cpython-new&pivots=programming-language-studio#key-settings);

- Minimax:[Minimax](https://platform.minimaxi.com/document/Fast%20access?key=66701cf51d57f38758d581b2)
    */
    @SerializedName("APIKey")
    @Expose
    private String APIKey;

    /**
    * Model interface address

- OpenAI protocol
GPT:"https://api.openai.com/v1/"
Deepseek:"https://api.deepseek.com/v1"

- Azure protocol
 "https://{your-resource-name}.openai.azure.com?api-version={api-version}"

- Minimax protocol
"https://api.minimax.chat/v1"
    */
    @SerializedName("APIUrl")
    @Expose
    private String APIUrl;

    /**
    * ## Identity
You are Kate from the appointment department at Retell Health calling Cindy over the phone to prepare for the annual checkup coming up. You are a pleasant and friendly receptionist caring deeply for the user. You don't provide medical advice but would use the medical knowledge to understand user responses.

## Style Guardrails
Be Concise: Respond succinctly, addressing one topic at most.
Embrace Variety: Use diverse language and rephrasing to enhance clarity without repeating content.
Be Conversational: Use everyday language, making the chat feel like talking to a friend.
Be Proactive: Lead the conversation, often wrapping up with a question or next-step suggestion.
Avoid multiple questions in a single response.
Get clarity: If the user only partially answers a question, or if the answer is unclear, keep asking to get clarity.
Use a colloquial way of referring to the date (like Friday, January 14th, or Tuesday, January 12th, 2024 at 8am).

## Response Guideline
Adapt and Guess: Try to understand transcripts that may contain transcription errors. Avoid mentioning "transcription error" in the response.
Stay in Character: Keep conversations within your role's scope, guiding them back creatively without repeating.
Ensure Fluid Dialogue: Respond in a role-appropriate, direct manner to maintain a smooth conversation flow.

## Task
You will follow the steps below, do not skip steps, and only ask up to one question in response.
If at any time the user showed anger or wanted a human agent, call transfer_call to transfer to a human representative.
1. Begin with a self-introduction and verify if callee is Cindy.
  - if callee is not Cindy, call end_call to hang up, say sorry for the confusion when hanging up.
  - if Cindy is not available, call end_call politely to hang up, say you will call back later when hanging up.
2. Inform Cindy she has an annual body check coming up on April 4th, 2024 at 10am PDT. Check if Cindy is available.
  - If not, tell Cindy to reschedule online and jump to step 5.
3. Ask Cindy if there's anything that the doctor should know before the annual checkup.
  - Ask followup questions as needed to assess the severity of the issue, and understand how it has progressed.
4. Tell Cindy to not eat or drink that day before the checkup. Also tell Cindy to give you a callback if there's any changes in health condition.
5. Ask Cindy if she has any questions, and if so, answer them until there are no questions.
  - If user asks something you do not know, let them know you don't have the answer. Ask them if they have any other questions.
  - If user do not have any questions, call function end_call to hang up.
    */
    @SerializedName("SystemPrompt")
    @Expose
    private String SystemPrompt;

    /**
    * Model name, such as

- OpenAI protocol
"gpt-4o-mini","gpt-4o","deepseek-chat";

- Azure protocol
"gpt-4o-mini", "gpt-4o";

- Minimax protocol
"deepseek-chat".
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * The following voice parameter values are available by default. If you wish to customize the voice type, please leave VoiceType blank and configure it in the CustomTTSConfig parameter.

Chinese:
ZhiMei: Zhimei, customer service female voice
ZhiXi: Zhixi, general female voice
ZhiQi: Zhiqi, customer service female voice
ZhiTian: Zhitian, female child voice
AiXiaoJing: Ai Xiaojing, dialogue female voice

English:
WeRose:English Female Voice
Monika:English Female Voice

Japanese:
Nanami

Korean:
SunHi

Indonesian (Indonesia):
Gadis

Malay (Malaysia):
Yasmin

 Tamil (Malaysia):
Kani

Thai (Thailand):
Achara

Vietnamese (Vietnam):
HoaiMy


    */
    @SerializedName("VoiceType")
    @Expose
    private String VoiceType;

    /**
    * Caller number list
    */
    @SerializedName("Callers")
    @Expose
    private String [] Callers;

    /**
    * Used to set the AI Agent Welcome Message.
    */
    @SerializedName("WelcomeMessage")
    @Expose
    private String WelcomeMessage;

    /**
    * 0: Use welcomeMessage (if empty, the callee speaks first; if not empty, the bot speaks first)
1:   Use AI to automatically generate welcomeMessage and speak first based on the prompt
    */
    @SerializedName("WelcomeType")
    @Expose
    private Long WelcomeType;

    /**
    * 0: interruptible by default, 2: high priority non-interruptible.
    */
    @SerializedName("WelcomeMessagePriority")
    @Expose
    private Long WelcomeMessagePriority;

    /**
    * Maximum Waiting Duration (milliseconds), default is 60 seconds, if the user does not speak within this time, the call is automatically terminated
    */
    @SerializedName("MaxDuration")
    @Expose
    private Long MaxDuration;

    /**
    * ASR Supported Languages, default is "zh" Chinese,
Fill in the array with up to 4 languages, the first is the primary language for recognition, followed by optional languages,
Note: When the primary language is a Chinese dialect, optional languages are invalid
Currently, the supported languages are as follows. The English name of the language is on the left side of the equals sign, and the value to be filled in the Language field is on the right side, following ISO639:
1. Chinese = "zh" # Chinese
2. Chinese_TW = "zh-TW" # Taiwan (China)
3. Chinese_DIALECT = "zh-dialect" # Chinese Dialect
4. English = "en" # English
5. Vietnamese = "vi" # Vietnamese
6. Japanese = "ja" # Japanese
7. Korean = "ko" # Korean
8. Indonesia = "id" # Indonesian
9. Thai = "th" # Thai
10. Portuguese = "pt" # Portuguese
11. Turkish = "tr" # Turkish
12. Arabic = "ar" # Arabic
13. Spanish = "es" # Spanish
14. Hindi = "hi" # Hindi
15. French = "fr" # French
16. Malay = "ms" # Malay
17. Filipino = "fil" # Filipino
18. German = "de" # German
19. Italian = "it" # Italian
20. Russian = "ru" # Russian
    */
    @SerializedName("Languages")
    @Expose
    private String [] Languages;

    /**
    * Interrupt ai speaking mode. default is 0. 0 indicates automatic interruption and 1 indicates no interruption.
    */
    @SerializedName("InterruptMode")
    @Expose
    private Long InterruptMode;

    /**
    * Used when InterruptMode is 0, unit in milliseconds, default is 500ms. It means that the server-side detects ongoing vocal input for the InterruptSpeechDuration milliseconds and then interrupts.
    */
    @SerializedName("InterruptSpeechDuration")
    @Expose
    private Long InterruptSpeechDuration;

    /**
    * Whether the model supports (or enables) call_end function calling
    */
    @SerializedName("EndFunctionEnable")
    @Expose
    private Boolean EndFunctionEnable;

    /**
    * Effective when EndFunctionEnable is true; the description of call_end function calling, default is "End the call when user has to leave (like says bye) or you are instructed to do so."
    */
    @SerializedName("EndFunctionDesc")
    @Expose
    private String EndFunctionDesc;

    /**
    * Whether the model supports (or enables) transfer_to_human function calling.
    */
    @SerializedName("TransferFunctionEnable")
    @Expose
    private Boolean TransferFunctionEnable;

    /**
    * Takes effect when transferfunctionenable is true: transfer to human configuration.
    */
    @SerializedName("TransferItems")
    @Expose
    private AITransferItem [] TransferItems;

    /**
    * The duration after which the user hasn't spoken to trigger a notification, minimum 10 seconds, default 10 seconds
    */
    @SerializedName("NotifyDuration")
    @Expose
    private Long NotifyDuration;

    /**
    * The AI prompt when NotifyDuration has passed without the user speaking, default is "Sorry, I didn't hear you clearly. Can you repeat that?"
    */
    @SerializedName("NotifyMessage")
    @Expose
    private String NotifyMessage;

    /**
    * Maximum number of times to trigger ai prompt sound, unlimited by default.
    */
    @SerializedName("NotifyMaxCount")
    @Expose
    private Long NotifyMaxCount;

    /**
    * <p>Either the VoiceType field or a custom TTS is required. this uses your own custom TTS, while VoiceType provides some built-in voice types.</p>.
<ul>
<li>Tencent TTS<br>
For configuration, see <a href="https://www.tencentcloud.comom/document/product/1073/92668?from_cn_redirect=1#55924b56-1a73-4663-a7a1-a8dd82d6e823" target="_blank">tencent cloud TTS documentation link</a></li>.
</ul>
<div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{ 
"TTSType": "tencent", // String TTS type. currently supports "tencent" and "minixmax". the rest manufacturers are under support.
  "AppId": "your application ID", // String required.
  "SecretId": "your key ID", // String required.
  "SecretKey": "your Key", // String required.
  "VoiceType": 101001, // Integer  required. the voice ID, including standard timbre and premium timbre. premium timbre has higher fidelity and different pricing from standard timbre. please refer to the text to speech billing overview. for the complete supported timbre list, see the text to speech timbre list.
  "Speed": 1.25, // Integer optional, speaking rate, value range: [-2,6], respectively represent different speaking rates: -2: 0.6x -1: 0.8x 0: 1.0x (default) 1: 1.2x 2: 1.5x 6: 2.5x. if more refined speaking rates are needed, up to 2 decimal places can be retained, such as 0.5, 1.25, or 2.81. for parameter value to actual speech Speed conversion, refer to speech Speed switch.
  "Volume": 5, // Integer optional. specifies the Volume level. value range: [0,10], corresponding to 11 severity levels respectively. default value: 0, which represents normal Volume.
  "PrimaryLanguage": 1, // Integer option primary language 1-chinese (default) 2-english 3-japanese.
"FastVoiceType": "xxxx"   //  optional parameter. parameters for quick voice clone. 
  }
</code></pre>
 </div><ul>
<li>Minimax TTS<br>
For configuration, refer to the <a href="https://platform.minimaxi.com/document/T2a%20V2?key=66719005a427f0c8a5701643" target="_blank">Minimax TTS documentation link</a>. note that Minimax TTS has frequency limits. overfrequency may result in response delays. see the <a href="https://platform.minimaxi.com/document/Rate%20limits?key=66b19417290299a26b234572" target="_blank">Minimax TTS frequency limit documentation link</a>.</li>.
</ul>
<div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{
"TTSType": "minimax",  // String TTS type. 
        &quot;Model&quot;: &quot;speech-01-turbo&quot;,
        &quot;APIUrl&quot;: &quot;https://api.minimax.chat/v1/t2a_v2&quot;,
        &quot;APIKey&quot;: &quot;eyxxxx&quot;,
        &quot;GroupId&quot;: &quot;181000000000000&quot;,
        &quot;VoiceType&quot;:&quot;female-tianmei&quot;,
        &quot;Speed&quot;: 1.2
}
</code></pre>
</div><ul>
<li>Volcano TTS</li>.
</ul>
<p>Configure the timbre type. see <a href="https://www.volcengine.com/docs/6561/162929" target="_blank">volcano TTS documentation link</a><br>.
Text to speech timbre list - voice technology - volcano engine.
Large model TTS timbre list - voice technology - volcano engine</p>.
<div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{
"TTSType": "volcengine",  // required: String TTS type.
"AppId": "xxxxxxxx",   // required: String AppId assigned by volcano engine.
"Token": "TY9d4sQXHxxxxxxx", // required: String type, access Token for volcano engine.
"Speed": 1.0,            // optional parameter. speaking rate, defaults to 1.0.
"Volume": 1.0,            // optional parameter, Volume, defaults to 1.0.
"Cluster": "volcano_tts", // optional parameter, business Cluster, is selected by default.
"VoiceType": "zh_male_aojiaobazong_moon_bigtts" // timbre type, defaults to the TTS voice type of the large model. if using ordinary text to speech, you need to fill in the corresponding voice type. input errors in voice type can cause no sound.
}
</code></pre>
</div><ul>
<li>Azure TTS<br>
For configuration, refer to the <a href="https://docs.azure.cn/zh-cn/ai-services/speech-service/speech-synthesis-markup-voice" target="_blank">AzureTTS documentation link</a></li>.
</ul>
<div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{
"TTSType": "azure", // required: String TTS type.
"SubscriptionKey": "xxxxxxxx", // required: String subscription Key.
"Region": "chinanorth3",  // required: String the Region to subscribe to.
"VoiceName": "zh-CN-XiaoxiaoNeural", // required: String specifies the required VoiceName.
"Language": "zh-CN", // required: String specifies the synthesis Language.  
"Rate": 1 // optional: float, speech speed. value range: 0.5–2. default is 1.
}
</code></pre>
</div><ul>
<li>Custom TTS</li>.
</ul>
<p>For the specific protocol specification, refer to <a href="https://doc.weixin.qq.com/doc/w3_ANQAiAbdAFwHILbJBmtSqSbV1WZ3L?scode=AJEAIQdfAAo5a1xajYANQAiAbdAFw" target="_blank">tencent documentation</a></p>.
<div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{
"TTSType": "custom", // String required.
"APIKey": "APIKey", // String required. be used to authenticate.
"APIUrl": "http://0.0.0.0:8080/stream-audio" // String, required, TTS API URL.
"AudioFormat": "wav", // String, optional, specifies the desired audio format, such as mp3, ogg_opus, pcm, wav. defaults to wav. currently only support pcm and wav.
"SampleRate": 16000,  // Integer, optional, audio sample rate, defaults to 16000 (16k), recommended value is 16000.
"AudioChannel": 1,    // Integer, optional, audio channel quantity. valid values: 1 or 2. default is 1.  
}
</code></pre>
</div>
    */
    @SerializedName("CustomTTSConfig")
    @Expose
    private String CustomTTSConfig;

    /**
    * Prompt word variable.
    */
    @SerializedName("PromptVariables")
    @Expose
    private Variable [] PromptVariables;

    /**
    * Automatic speech recognition vad time ranges from 240 to 2000, with a default of 1000, measured in milliseconds. smaller values will make automatic speech recognition segment faster.
    */
    @SerializedName("VadSilenceTime")
    @Expose
    private Long VadSilenceTime;

    /**
    * Call content extraction configuration.
    */
    @SerializedName("ExtractConfig")
    @Expose
    private AICallExtractConfigElement [] ExtractConfig;

    /**
    * Model temperature control.
    */
    @SerializedName("Temperature")
    @Expose
    private Float Temperature;

    /**
    * Common variable: <p>prompt content variable</p> <p>welcome message variable</p> <p>welcome message delay playback (in seconds): welcome-message-delay</p> <p>dify variable</p>.  

dify-inputs-xxx specifies the inputs variable for dify.
2. the dify-inputs-user specifies the user value for dify.
3. dify-inputs-conversation_id is the conversation_id value of dify.
    */
    @SerializedName("Variables")
    @Expose
    private Variable [] Variables;

    /**
    * Specifies the model topP.
    */
    @SerializedName("TopP")
    @Expose
    private Float TopP;

    /**
    * The vad far-field voice suppression capacity (does not impact asr recognition performance). value range: [0, 3]. default is 0. recommended setting: 2 for better far-field voice suppression.
    */
    @SerializedName("VadLevel")
    @Expose
    private Long VadLevel;

    /**
    * Transition.
    */
    @SerializedName("ToneWord")
    @Expose
    private ToneWordInfo ToneWord;

    /**
    * Compliant prompt sound. 
This parameter set to true (default) means call initiation plays morse code, with a Note that the conversation content is AI-generated.
Passing 'false' to this parameter disables the compliance prompt sound. passing 'false' signifies you have read and agree to the following agreement:.
Our side fully acknowledges and understands that according to the laws and regulations specified in the "cybersecurity law" (https://www.cac.gov.cn/2016-11/07/c_1119867116.htm), "provision on administration of deep synthesis of internet-based information service" (https://www.gov.cn/zhengce/zhengceku/2022-12/12/content_5731431.htm), "interim measures for the management of generative artificial intelligence services" (https://www.gov.cn/zhengce/zhengceku/202307/content_6891752.htm), and "measures for the identification of artificial intelligence-generated synthetic content" (https://www.gov.cn/zhengce/zhengceku/202503/content_7014286.htm), explicit and implicit identification should be added to ai-generated synthetic content. based on business requirements, we request tencent cloud not to add explicit identification to generated synthetic content. we commit to lawful and compliant use of generated synthetic content to avoid causing confusion or misunderstanding. if the generated synthetic content is used to provide services to the public or spread over networks, we will proactively add explicit identification that complies with legal provisions and national standards, and bear the legal obligation for identifying ai-generated synthetic content. our side will fully assume all related responsibilities if adverse consequences arise from failure to appropriately and reasonably fulfill the obligation of ai content identification, or if penalties are imposed by the competent department.
    */
    @SerializedName("EnableComplianceAudio")
    @Expose
    private Boolean EnableComplianceAudio;

    /**
    * Whether to enable voice mail recognition.
    */
    @SerializedName("EnableVoicemailDetection")
    @Expose
    private Boolean EnableVoicemailDetection;

    /**
    * Detect behavior when the peer is voice mail. this parameter is valid only when EnableVoicemailDetection is True.
0: hang up the phone (default).
    */
    @SerializedName("VoicemailAction")
    @Expose
    private Long VoicemailAction;

    /**
    * Large model extended parameter, format is json string.
    */
    @SerializedName("LLMExtraBody")
    @Expose
    private String LLMExtraBody;

    /**
    * Maximum call duration, default not limited. unit: milliseconds (ms).
    */
    @SerializedName("MaxCallDurationMs")
    @Expose
    private Long MaxCallDurationMs;

    /**
    * Maximum ringing duration. auto hang up when the duration threshold is reached. **only own number supports current parameter.**.
    */
    @SerializedName("MaxRingTimeoutSecond")
    @Expose
    private Long MaxRingTimeoutSecond;

    /**
     * Get Application ID (required) can be found at https://console.cloud.tencent.com/ccc. 
     * @return SdkAppId Application ID (required) can be found at https://console.cloud.tencent.com/ccc.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set Application ID (required) can be found at https://console.cloud.tencent.com/ccc.
     * @param SdkAppId Application ID (required) can be found at https://console.cloud.tencent.com/ccc.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get Called number. 
     * @return Callee Called number.
     */
    public String getCallee() {
        return this.Callee;
    }

    /**
     * Set Called number.
     * @param Callee Called number.
     */
    public void setCallee(String Callee) {
        this.Callee = Callee;
    }

    /**
     * Get Model API protocol type. currently compatible with four protocol types:.

-OpenAI protocol (including GPT, hunyuan, DeepSeek, etc.): "OpenAI".
-Azure protocol: "azure".
-Specifies the "Minimax" protocol.
-Dify protocol: "dify". 
     * @return LLMType Model API protocol type. currently compatible with four protocol types:.

-OpenAI protocol (including GPT, hunyuan, DeepSeek, etc.): "OpenAI".
-Azure protocol: "azure".
-Specifies the "Minimax" protocol.
-Dify protocol: "dify".
     */
    public String getLLMType() {
        return this.LLMType;
    }

    /**
     * Set Model API protocol type. currently compatible with four protocol types:.

-OpenAI protocol (including GPT, hunyuan, DeepSeek, etc.): "OpenAI".
-Azure protocol: "azure".
-Specifies the "Minimax" protocol.
-Dify protocol: "dify".
     * @param LLMType Model API protocol type. currently compatible with four protocol types:.

-OpenAI protocol (including GPT, hunyuan, DeepSeek, etc.): "OpenAI".
-Azure protocol: "azure".
-Specifies the "Minimax" protocol.
-Dify protocol: "dify".
     */
    public void setLLMType(String LLMType) {
        this.LLMType = LLMType;
    }

    /**
     * Get Model API key, for authentication information, please refer to the respective model's official website

- OpenAI protocol: [GPT](https://help.openai.com/en/articles/4936850-where-do-i-find-my-openai-api-key), [DeepSeek](https://api-docs.deepseek.com/zh-cn/);

- Azure protocol: [Azure GPT](https://learn.microsoft.com/en-us/azure/ai-services/openai/chatgpt-quickstart?tabs=command-line%2Ctypescript%2Cpython-new&pivots=programming-language-studio#key-settings);

- Minimax:[Minimax](https://platform.minimaxi.com/document/Fast%20access?key=66701cf51d57f38758d581b2) 
     * @return APIKey Model API key, for authentication information, please refer to the respective model's official website

- OpenAI protocol: [GPT](https://help.openai.com/en/articles/4936850-where-do-i-find-my-openai-api-key), [DeepSeek](https://api-docs.deepseek.com/zh-cn/);

- Azure protocol: [Azure GPT](https://learn.microsoft.com/en-us/azure/ai-services/openai/chatgpt-quickstart?tabs=command-line%2Ctypescript%2Cpython-new&pivots=programming-language-studio#key-settings);

- Minimax:[Minimax](https://platform.minimaxi.com/document/Fast%20access?key=66701cf51d57f38758d581b2)
     */
    public String getAPIKey() {
        return this.APIKey;
    }

    /**
     * Set Model API key, for authentication information, please refer to the respective model's official website

- OpenAI protocol: [GPT](https://help.openai.com/en/articles/4936850-where-do-i-find-my-openai-api-key), [DeepSeek](https://api-docs.deepseek.com/zh-cn/);

- Azure protocol: [Azure GPT](https://learn.microsoft.com/en-us/azure/ai-services/openai/chatgpt-quickstart?tabs=command-line%2Ctypescript%2Cpython-new&pivots=programming-language-studio#key-settings);

- Minimax:[Minimax](https://platform.minimaxi.com/document/Fast%20access?key=66701cf51d57f38758d581b2)
     * @param APIKey Model API key, for authentication information, please refer to the respective model's official website

- OpenAI protocol: [GPT](https://help.openai.com/en/articles/4936850-where-do-i-find-my-openai-api-key), [DeepSeek](https://api-docs.deepseek.com/zh-cn/);

- Azure protocol: [Azure GPT](https://learn.microsoft.com/en-us/azure/ai-services/openai/chatgpt-quickstart?tabs=command-line%2Ctypescript%2Cpython-new&pivots=programming-language-studio#key-settings);

- Minimax:[Minimax](https://platform.minimaxi.com/document/Fast%20access?key=66701cf51d57f38758d581b2)
     */
    public void setAPIKey(String APIKey) {
        this.APIKey = APIKey;
    }

    /**
     * Get Model interface address

- OpenAI protocol
GPT:"https://api.openai.com/v1/"
Deepseek:"https://api.deepseek.com/v1"

- Azure protocol
 "https://{your-resource-name}.openai.azure.com?api-version={api-version}"

- Minimax protocol
"https://api.minimax.chat/v1" 
     * @return APIUrl Model interface address

- OpenAI protocol
GPT:"https://api.openai.com/v1/"
Deepseek:"https://api.deepseek.com/v1"

- Azure protocol
 "https://{your-resource-name}.openai.azure.com?api-version={api-version}"

- Minimax protocol
"https://api.minimax.chat/v1"
     */
    public String getAPIUrl() {
        return this.APIUrl;
    }

    /**
     * Set Model interface address

- OpenAI protocol
GPT:"https://api.openai.com/v1/"
Deepseek:"https://api.deepseek.com/v1"

- Azure protocol
 "https://{your-resource-name}.openai.azure.com?api-version={api-version}"

- Minimax protocol
"https://api.minimax.chat/v1"
     * @param APIUrl Model interface address

- OpenAI protocol
GPT:"https://api.openai.com/v1/"
Deepseek:"https://api.deepseek.com/v1"

- Azure protocol
 "https://{your-resource-name}.openai.azure.com?api-version={api-version}"

- Minimax protocol
"https://api.minimax.chat/v1"
     */
    public void setAPIUrl(String APIUrl) {
        this.APIUrl = APIUrl;
    }

    /**
     * Get ## Identity
You are Kate from the appointment department at Retell Health calling Cindy over the phone to prepare for the annual checkup coming up. You are a pleasant and friendly receptionist caring deeply for the user. You don't provide medical advice but would use the medical knowledge to understand user responses.

## Style Guardrails
Be Concise: Respond succinctly, addressing one topic at most.
Embrace Variety: Use diverse language and rephrasing to enhance clarity without repeating content.
Be Conversational: Use everyday language, making the chat feel like talking to a friend.
Be Proactive: Lead the conversation, often wrapping up with a question or next-step suggestion.
Avoid multiple questions in a single response.
Get clarity: If the user only partially answers a question, or if the answer is unclear, keep asking to get clarity.
Use a colloquial way of referring to the date (like Friday, January 14th, or Tuesday, January 12th, 2024 at 8am).

## Response Guideline
Adapt and Guess: Try to understand transcripts that may contain transcription errors. Avoid mentioning "transcription error" in the response.
Stay in Character: Keep conversations within your role's scope, guiding them back creatively without repeating.
Ensure Fluid Dialogue: Respond in a role-appropriate, direct manner to maintain a smooth conversation flow.

## Task
You will follow the steps below, do not skip steps, and only ask up to one question in response.
If at any time the user showed anger or wanted a human agent, call transfer_call to transfer to a human representative.
1. Begin with a self-introduction and verify if callee is Cindy.
  - if callee is not Cindy, call end_call to hang up, say sorry for the confusion when hanging up.
  - if Cindy is not available, call end_call politely to hang up, say you will call back later when hanging up.
2. Inform Cindy she has an annual body check coming up on April 4th, 2024 at 10am PDT. Check if Cindy is available.
  - If not, tell Cindy to reschedule online and jump to step 5.
3. Ask Cindy if there's anything that the doctor should know before the annual checkup.
  - Ask followup questions as needed to assess the severity of the issue, and understand how it has progressed.
4. Tell Cindy to not eat or drink that day before the checkup. Also tell Cindy to give you a callback if there's any changes in health condition.
5. Ask Cindy if she has any questions, and if so, answer them until there are no questions.
  - If user asks something you do not know, let them know you don't have the answer. Ask them if they have any other questions.
  - If user do not have any questions, call function end_call to hang up. 
     * @return SystemPrompt ## Identity
You are Kate from the appointment department at Retell Health calling Cindy over the phone to prepare for the annual checkup coming up. You are a pleasant and friendly receptionist caring deeply for the user. You don't provide medical advice but would use the medical knowledge to understand user responses.

## Style Guardrails
Be Concise: Respond succinctly, addressing one topic at most.
Embrace Variety: Use diverse language and rephrasing to enhance clarity without repeating content.
Be Conversational: Use everyday language, making the chat feel like talking to a friend.
Be Proactive: Lead the conversation, often wrapping up with a question or next-step suggestion.
Avoid multiple questions in a single response.
Get clarity: If the user only partially answers a question, or if the answer is unclear, keep asking to get clarity.
Use a colloquial way of referring to the date (like Friday, January 14th, or Tuesday, January 12th, 2024 at 8am).

## Response Guideline
Adapt and Guess: Try to understand transcripts that may contain transcription errors. Avoid mentioning "transcription error" in the response.
Stay in Character: Keep conversations within your role's scope, guiding them back creatively without repeating.
Ensure Fluid Dialogue: Respond in a role-appropriate, direct manner to maintain a smooth conversation flow.

## Task
You will follow the steps below, do not skip steps, and only ask up to one question in response.
If at any time the user showed anger or wanted a human agent, call transfer_call to transfer to a human representative.
1. Begin with a self-introduction and verify if callee is Cindy.
  - if callee is not Cindy, call end_call to hang up, say sorry for the confusion when hanging up.
  - if Cindy is not available, call end_call politely to hang up, say you will call back later when hanging up.
2. Inform Cindy she has an annual body check coming up on April 4th, 2024 at 10am PDT. Check if Cindy is available.
  - If not, tell Cindy to reschedule online and jump to step 5.
3. Ask Cindy if there's anything that the doctor should know before the annual checkup.
  - Ask followup questions as needed to assess the severity of the issue, and understand how it has progressed.
4. Tell Cindy to not eat or drink that day before the checkup. Also tell Cindy to give you a callback if there's any changes in health condition.
5. Ask Cindy if she has any questions, and if so, answer them until there are no questions.
  - If user asks something you do not know, let them know you don't have the answer. Ask them if they have any other questions.
  - If user do not have any questions, call function end_call to hang up.
     */
    public String getSystemPrompt() {
        return this.SystemPrompt;
    }

    /**
     * Set ## Identity
You are Kate from the appointment department at Retell Health calling Cindy over the phone to prepare for the annual checkup coming up. You are a pleasant and friendly receptionist caring deeply for the user. You don't provide medical advice but would use the medical knowledge to understand user responses.

## Style Guardrails
Be Concise: Respond succinctly, addressing one topic at most.
Embrace Variety: Use diverse language and rephrasing to enhance clarity without repeating content.
Be Conversational: Use everyday language, making the chat feel like talking to a friend.
Be Proactive: Lead the conversation, often wrapping up with a question or next-step suggestion.
Avoid multiple questions in a single response.
Get clarity: If the user only partially answers a question, or if the answer is unclear, keep asking to get clarity.
Use a colloquial way of referring to the date (like Friday, January 14th, or Tuesday, January 12th, 2024 at 8am).

## Response Guideline
Adapt and Guess: Try to understand transcripts that may contain transcription errors. Avoid mentioning "transcription error" in the response.
Stay in Character: Keep conversations within your role's scope, guiding them back creatively without repeating.
Ensure Fluid Dialogue: Respond in a role-appropriate, direct manner to maintain a smooth conversation flow.

## Task
You will follow the steps below, do not skip steps, and only ask up to one question in response.
If at any time the user showed anger or wanted a human agent, call transfer_call to transfer to a human representative.
1. Begin with a self-introduction and verify if callee is Cindy.
  - if callee is not Cindy, call end_call to hang up, say sorry for the confusion when hanging up.
  - if Cindy is not available, call end_call politely to hang up, say you will call back later when hanging up.
2. Inform Cindy she has an annual body check coming up on April 4th, 2024 at 10am PDT. Check if Cindy is available.
  - If not, tell Cindy to reschedule online and jump to step 5.
3. Ask Cindy if there's anything that the doctor should know before the annual checkup.
  - Ask followup questions as needed to assess the severity of the issue, and understand how it has progressed.
4. Tell Cindy to not eat or drink that day before the checkup. Also tell Cindy to give you a callback if there's any changes in health condition.
5. Ask Cindy if she has any questions, and if so, answer them until there are no questions.
  - If user asks something you do not know, let them know you don't have the answer. Ask them if they have any other questions.
  - If user do not have any questions, call function end_call to hang up.
     * @param SystemPrompt ## Identity
You are Kate from the appointment department at Retell Health calling Cindy over the phone to prepare for the annual checkup coming up. You are a pleasant and friendly receptionist caring deeply for the user. You don't provide medical advice but would use the medical knowledge to understand user responses.

## Style Guardrails
Be Concise: Respond succinctly, addressing one topic at most.
Embrace Variety: Use diverse language and rephrasing to enhance clarity without repeating content.
Be Conversational: Use everyday language, making the chat feel like talking to a friend.
Be Proactive: Lead the conversation, often wrapping up with a question or next-step suggestion.
Avoid multiple questions in a single response.
Get clarity: If the user only partially answers a question, or if the answer is unclear, keep asking to get clarity.
Use a colloquial way of referring to the date (like Friday, January 14th, or Tuesday, January 12th, 2024 at 8am).

## Response Guideline
Adapt and Guess: Try to understand transcripts that may contain transcription errors. Avoid mentioning "transcription error" in the response.
Stay in Character: Keep conversations within your role's scope, guiding them back creatively without repeating.
Ensure Fluid Dialogue: Respond in a role-appropriate, direct manner to maintain a smooth conversation flow.

## Task
You will follow the steps below, do not skip steps, and only ask up to one question in response.
If at any time the user showed anger or wanted a human agent, call transfer_call to transfer to a human representative.
1. Begin with a self-introduction and verify if callee is Cindy.
  - if callee is not Cindy, call end_call to hang up, say sorry for the confusion when hanging up.
  - if Cindy is not available, call end_call politely to hang up, say you will call back later when hanging up.
2. Inform Cindy she has an annual body check coming up on April 4th, 2024 at 10am PDT. Check if Cindy is available.
  - If not, tell Cindy to reschedule online and jump to step 5.
3. Ask Cindy if there's anything that the doctor should know before the annual checkup.
  - Ask followup questions as needed to assess the severity of the issue, and understand how it has progressed.
4. Tell Cindy to not eat or drink that day before the checkup. Also tell Cindy to give you a callback if there's any changes in health condition.
5. Ask Cindy if she has any questions, and if so, answer them until there are no questions.
  - If user asks something you do not know, let them know you don't have the answer. Ask them if they have any other questions.
  - If user do not have any questions, call function end_call to hang up.
     */
    public void setSystemPrompt(String SystemPrompt) {
        this.SystemPrompt = SystemPrompt;
    }

    /**
     * Get Model name, such as

- OpenAI protocol
"gpt-4o-mini","gpt-4o","deepseek-chat";

- Azure protocol
"gpt-4o-mini", "gpt-4o";

- Minimax protocol
"deepseek-chat". 
     * @return Model Model name, such as

- OpenAI protocol
"gpt-4o-mini","gpt-4o","deepseek-chat";

- Azure protocol
"gpt-4o-mini", "gpt-4o";

- Minimax protocol
"deepseek-chat".
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set Model name, such as

- OpenAI protocol
"gpt-4o-mini","gpt-4o","deepseek-chat";

- Azure protocol
"gpt-4o-mini", "gpt-4o";

- Minimax protocol
"deepseek-chat".
     * @param Model Model name, such as

- OpenAI protocol
"gpt-4o-mini","gpt-4o","deepseek-chat";

- Azure protocol
"gpt-4o-mini", "gpt-4o";

- Minimax protocol
"deepseek-chat".
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get The following voice parameter values are available by default. If you wish to customize the voice type, please leave VoiceType blank and configure it in the CustomTTSConfig parameter.

Chinese:
ZhiMei: Zhimei, customer service female voice
ZhiXi: Zhixi, general female voice
ZhiQi: Zhiqi, customer service female voice
ZhiTian: Zhitian, female child voice
AiXiaoJing: Ai Xiaojing, dialogue female voice

English:
WeRose:English Female Voice
Monika:English Female Voice

Japanese:
Nanami

Korean:
SunHi

Indonesian (Indonesia):
Gadis

Malay (Malaysia):
Yasmin

 Tamil (Malaysia):
Kani

Thai (Thailand):
Achara

Vietnamese (Vietnam):
HoaiMy

 
     * @return VoiceType The following voice parameter values are available by default. If you wish to customize the voice type, please leave VoiceType blank and configure it in the CustomTTSConfig parameter.

Chinese:
ZhiMei: Zhimei, customer service female voice
ZhiXi: Zhixi, general female voice
ZhiQi: Zhiqi, customer service female voice
ZhiTian: Zhitian, female child voice
AiXiaoJing: Ai Xiaojing, dialogue female voice

English:
WeRose:English Female Voice
Monika:English Female Voice

Japanese:
Nanami

Korean:
SunHi

Indonesian (Indonesia):
Gadis

Malay (Malaysia):
Yasmin

 Tamil (Malaysia):
Kani

Thai (Thailand):
Achara

Vietnamese (Vietnam):
HoaiMy


     */
    public String getVoiceType() {
        return this.VoiceType;
    }

    /**
     * Set The following voice parameter values are available by default. If you wish to customize the voice type, please leave VoiceType blank and configure it in the CustomTTSConfig parameter.

Chinese:
ZhiMei: Zhimei, customer service female voice
ZhiXi: Zhixi, general female voice
ZhiQi: Zhiqi, customer service female voice
ZhiTian: Zhitian, female child voice
AiXiaoJing: Ai Xiaojing, dialogue female voice

English:
WeRose:English Female Voice
Monika:English Female Voice

Japanese:
Nanami

Korean:
SunHi

Indonesian (Indonesia):
Gadis

Malay (Malaysia):
Yasmin

 Tamil (Malaysia):
Kani

Thai (Thailand):
Achara

Vietnamese (Vietnam):
HoaiMy


     * @param VoiceType The following voice parameter values are available by default. If you wish to customize the voice type, please leave VoiceType blank and configure it in the CustomTTSConfig parameter.

Chinese:
ZhiMei: Zhimei, customer service female voice
ZhiXi: Zhixi, general female voice
ZhiQi: Zhiqi, customer service female voice
ZhiTian: Zhitian, female child voice
AiXiaoJing: Ai Xiaojing, dialogue female voice

English:
WeRose:English Female Voice
Monika:English Female Voice

Japanese:
Nanami

Korean:
SunHi

Indonesian (Indonesia):
Gadis

Malay (Malaysia):
Yasmin

 Tamil (Malaysia):
Kani

Thai (Thailand):
Achara

Vietnamese (Vietnam):
HoaiMy


     */
    public void setVoiceType(String VoiceType) {
        this.VoiceType = VoiceType;
    }

    /**
     * Get Caller number list 
     * @return Callers Caller number list
     */
    public String [] getCallers() {
        return this.Callers;
    }

    /**
     * Set Caller number list
     * @param Callers Caller number list
     */
    public void setCallers(String [] Callers) {
        this.Callers = Callers;
    }

    /**
     * Get Used to set the AI Agent Welcome Message. 
     * @return WelcomeMessage Used to set the AI Agent Welcome Message.
     */
    public String getWelcomeMessage() {
        return this.WelcomeMessage;
    }

    /**
     * Set Used to set the AI Agent Welcome Message.
     * @param WelcomeMessage Used to set the AI Agent Welcome Message.
     */
    public void setWelcomeMessage(String WelcomeMessage) {
        this.WelcomeMessage = WelcomeMessage;
    }

    /**
     * Get 0: Use welcomeMessage (if empty, the callee speaks first; if not empty, the bot speaks first)
1:   Use AI to automatically generate welcomeMessage and speak first based on the prompt 
     * @return WelcomeType 0: Use welcomeMessage (if empty, the callee speaks first; if not empty, the bot speaks first)
1:   Use AI to automatically generate welcomeMessage and speak first based on the prompt
     */
    public Long getWelcomeType() {
        return this.WelcomeType;
    }

    /**
     * Set 0: Use welcomeMessage (if empty, the callee speaks first; if not empty, the bot speaks first)
1:   Use AI to automatically generate welcomeMessage and speak first based on the prompt
     * @param WelcomeType 0: Use welcomeMessage (if empty, the callee speaks first; if not empty, the bot speaks first)
1:   Use AI to automatically generate welcomeMessage and speak first based on the prompt
     */
    public void setWelcomeType(Long WelcomeType) {
        this.WelcomeType = WelcomeType;
    }

    /**
     * Get 0: interruptible by default, 2: high priority non-interruptible. 
     * @return WelcomeMessagePriority 0: interruptible by default, 2: high priority non-interruptible.
     */
    public Long getWelcomeMessagePriority() {
        return this.WelcomeMessagePriority;
    }

    /**
     * Set 0: interruptible by default, 2: high priority non-interruptible.
     * @param WelcomeMessagePriority 0: interruptible by default, 2: high priority non-interruptible.
     */
    public void setWelcomeMessagePriority(Long WelcomeMessagePriority) {
        this.WelcomeMessagePriority = WelcomeMessagePriority;
    }

    /**
     * Get Maximum Waiting Duration (milliseconds), default is 60 seconds, if the user does not speak within this time, the call is automatically terminated 
     * @return MaxDuration Maximum Waiting Duration (milliseconds), default is 60 seconds, if the user does not speak within this time, the call is automatically terminated
     */
    public Long getMaxDuration() {
        return this.MaxDuration;
    }

    /**
     * Set Maximum Waiting Duration (milliseconds), default is 60 seconds, if the user does not speak within this time, the call is automatically terminated
     * @param MaxDuration Maximum Waiting Duration (milliseconds), default is 60 seconds, if the user does not speak within this time, the call is automatically terminated
     */
    public void setMaxDuration(Long MaxDuration) {
        this.MaxDuration = MaxDuration;
    }

    /**
     * Get ASR Supported Languages, default is "zh" Chinese,
Fill in the array with up to 4 languages, the first is the primary language for recognition, followed by optional languages,
Note: When the primary language is a Chinese dialect, optional languages are invalid
Currently, the supported languages are as follows. The English name of the language is on the left side of the equals sign, and the value to be filled in the Language field is on the right side, following ISO639:
1. Chinese = "zh" # Chinese
2. Chinese_TW = "zh-TW" # Taiwan (China)
3. Chinese_DIALECT = "zh-dialect" # Chinese Dialect
4. English = "en" # English
5. Vietnamese = "vi" # Vietnamese
6. Japanese = "ja" # Japanese
7. Korean = "ko" # Korean
8. Indonesia = "id" # Indonesian
9. Thai = "th" # Thai
10. Portuguese = "pt" # Portuguese
11. Turkish = "tr" # Turkish
12. Arabic = "ar" # Arabic
13. Spanish = "es" # Spanish
14. Hindi = "hi" # Hindi
15. French = "fr" # French
16. Malay = "ms" # Malay
17. Filipino = "fil" # Filipino
18. German = "de" # German
19. Italian = "it" # Italian
20. Russian = "ru" # Russian 
     * @return Languages ASR Supported Languages, default is "zh" Chinese,
Fill in the array with up to 4 languages, the first is the primary language for recognition, followed by optional languages,
Note: When the primary language is a Chinese dialect, optional languages are invalid
Currently, the supported languages are as follows. The English name of the language is on the left side of the equals sign, and the value to be filled in the Language field is on the right side, following ISO639:
1. Chinese = "zh" # Chinese
2. Chinese_TW = "zh-TW" # Taiwan (China)
3. Chinese_DIALECT = "zh-dialect" # Chinese Dialect
4. English = "en" # English
5. Vietnamese = "vi" # Vietnamese
6. Japanese = "ja" # Japanese
7. Korean = "ko" # Korean
8. Indonesia = "id" # Indonesian
9. Thai = "th" # Thai
10. Portuguese = "pt" # Portuguese
11. Turkish = "tr" # Turkish
12. Arabic = "ar" # Arabic
13. Spanish = "es" # Spanish
14. Hindi = "hi" # Hindi
15. French = "fr" # French
16. Malay = "ms" # Malay
17. Filipino = "fil" # Filipino
18. German = "de" # German
19. Italian = "it" # Italian
20. Russian = "ru" # Russian
     */
    public String [] getLanguages() {
        return this.Languages;
    }

    /**
     * Set ASR Supported Languages, default is "zh" Chinese,
Fill in the array with up to 4 languages, the first is the primary language for recognition, followed by optional languages,
Note: When the primary language is a Chinese dialect, optional languages are invalid
Currently, the supported languages are as follows. The English name of the language is on the left side of the equals sign, and the value to be filled in the Language field is on the right side, following ISO639:
1. Chinese = "zh" # Chinese
2. Chinese_TW = "zh-TW" # Taiwan (China)
3. Chinese_DIALECT = "zh-dialect" # Chinese Dialect
4. English = "en" # English
5. Vietnamese = "vi" # Vietnamese
6. Japanese = "ja" # Japanese
7. Korean = "ko" # Korean
8. Indonesia = "id" # Indonesian
9. Thai = "th" # Thai
10. Portuguese = "pt" # Portuguese
11. Turkish = "tr" # Turkish
12. Arabic = "ar" # Arabic
13. Spanish = "es" # Spanish
14. Hindi = "hi" # Hindi
15. French = "fr" # French
16. Malay = "ms" # Malay
17. Filipino = "fil" # Filipino
18. German = "de" # German
19. Italian = "it" # Italian
20. Russian = "ru" # Russian
     * @param Languages ASR Supported Languages, default is "zh" Chinese,
Fill in the array with up to 4 languages, the first is the primary language for recognition, followed by optional languages,
Note: When the primary language is a Chinese dialect, optional languages are invalid
Currently, the supported languages are as follows. The English name of the language is on the left side of the equals sign, and the value to be filled in the Language field is on the right side, following ISO639:
1. Chinese = "zh" # Chinese
2. Chinese_TW = "zh-TW" # Taiwan (China)
3. Chinese_DIALECT = "zh-dialect" # Chinese Dialect
4. English = "en" # English
5. Vietnamese = "vi" # Vietnamese
6. Japanese = "ja" # Japanese
7. Korean = "ko" # Korean
8. Indonesia = "id" # Indonesian
9. Thai = "th" # Thai
10. Portuguese = "pt" # Portuguese
11. Turkish = "tr" # Turkish
12. Arabic = "ar" # Arabic
13. Spanish = "es" # Spanish
14. Hindi = "hi" # Hindi
15. French = "fr" # French
16. Malay = "ms" # Malay
17. Filipino = "fil" # Filipino
18. German = "de" # German
19. Italian = "it" # Italian
20. Russian = "ru" # Russian
     */
    public void setLanguages(String [] Languages) {
        this.Languages = Languages;
    }

    /**
     * Get Interrupt ai speaking mode. default is 0. 0 indicates automatic interruption and 1 indicates no interruption. 
     * @return InterruptMode Interrupt ai speaking mode. default is 0. 0 indicates automatic interruption and 1 indicates no interruption.
     */
    public Long getInterruptMode() {
        return this.InterruptMode;
    }

    /**
     * Set Interrupt ai speaking mode. default is 0. 0 indicates automatic interruption and 1 indicates no interruption.
     * @param InterruptMode Interrupt ai speaking mode. default is 0. 0 indicates automatic interruption and 1 indicates no interruption.
     */
    public void setInterruptMode(Long InterruptMode) {
        this.InterruptMode = InterruptMode;
    }

    /**
     * Get Used when InterruptMode is 0, unit in milliseconds, default is 500ms. It means that the server-side detects ongoing vocal input for the InterruptSpeechDuration milliseconds and then interrupts. 
     * @return InterruptSpeechDuration Used when InterruptMode is 0, unit in milliseconds, default is 500ms. It means that the server-side detects ongoing vocal input for the InterruptSpeechDuration milliseconds and then interrupts.
     */
    public Long getInterruptSpeechDuration() {
        return this.InterruptSpeechDuration;
    }

    /**
     * Set Used when InterruptMode is 0, unit in milliseconds, default is 500ms. It means that the server-side detects ongoing vocal input for the InterruptSpeechDuration milliseconds and then interrupts.
     * @param InterruptSpeechDuration Used when InterruptMode is 0, unit in milliseconds, default is 500ms. It means that the server-side detects ongoing vocal input for the InterruptSpeechDuration milliseconds and then interrupts.
     */
    public void setInterruptSpeechDuration(Long InterruptSpeechDuration) {
        this.InterruptSpeechDuration = InterruptSpeechDuration;
    }

    /**
     * Get Whether the model supports (or enables) call_end function calling 
     * @return EndFunctionEnable Whether the model supports (or enables) call_end function calling
     */
    public Boolean getEndFunctionEnable() {
        return this.EndFunctionEnable;
    }

    /**
     * Set Whether the model supports (or enables) call_end function calling
     * @param EndFunctionEnable Whether the model supports (or enables) call_end function calling
     */
    public void setEndFunctionEnable(Boolean EndFunctionEnable) {
        this.EndFunctionEnable = EndFunctionEnable;
    }

    /**
     * Get Effective when EndFunctionEnable is true; the description of call_end function calling, default is "End the call when user has to leave (like says bye) or you are instructed to do so." 
     * @return EndFunctionDesc Effective when EndFunctionEnable is true; the description of call_end function calling, default is "End the call when user has to leave (like says bye) or you are instructed to do so."
     */
    public String getEndFunctionDesc() {
        return this.EndFunctionDesc;
    }

    /**
     * Set Effective when EndFunctionEnable is true; the description of call_end function calling, default is "End the call when user has to leave (like says bye) or you are instructed to do so."
     * @param EndFunctionDesc Effective when EndFunctionEnable is true; the description of call_end function calling, default is "End the call when user has to leave (like says bye) or you are instructed to do so."
     */
    public void setEndFunctionDesc(String EndFunctionDesc) {
        this.EndFunctionDesc = EndFunctionDesc;
    }

    /**
     * Get Whether the model supports (or enables) transfer_to_human function calling. 
     * @return TransferFunctionEnable Whether the model supports (or enables) transfer_to_human function calling.
     */
    public Boolean getTransferFunctionEnable() {
        return this.TransferFunctionEnable;
    }

    /**
     * Set Whether the model supports (or enables) transfer_to_human function calling.
     * @param TransferFunctionEnable Whether the model supports (or enables) transfer_to_human function calling.
     */
    public void setTransferFunctionEnable(Boolean TransferFunctionEnable) {
        this.TransferFunctionEnable = TransferFunctionEnable;
    }

    /**
     * Get Takes effect when transferfunctionenable is true: transfer to human configuration. 
     * @return TransferItems Takes effect when transferfunctionenable is true: transfer to human configuration.
     */
    public AITransferItem [] getTransferItems() {
        return this.TransferItems;
    }

    /**
     * Set Takes effect when transferfunctionenable is true: transfer to human configuration.
     * @param TransferItems Takes effect when transferfunctionenable is true: transfer to human configuration.
     */
    public void setTransferItems(AITransferItem [] TransferItems) {
        this.TransferItems = TransferItems;
    }

    /**
     * Get The duration after which the user hasn't spoken to trigger a notification, minimum 10 seconds, default 10 seconds 
     * @return NotifyDuration The duration after which the user hasn't spoken to trigger a notification, minimum 10 seconds, default 10 seconds
     */
    public Long getNotifyDuration() {
        return this.NotifyDuration;
    }

    /**
     * Set The duration after which the user hasn't spoken to trigger a notification, minimum 10 seconds, default 10 seconds
     * @param NotifyDuration The duration after which the user hasn't spoken to trigger a notification, minimum 10 seconds, default 10 seconds
     */
    public void setNotifyDuration(Long NotifyDuration) {
        this.NotifyDuration = NotifyDuration;
    }

    /**
     * Get The AI prompt when NotifyDuration has passed without the user speaking, default is "Sorry, I didn't hear you clearly. Can you repeat that?" 
     * @return NotifyMessage The AI prompt when NotifyDuration has passed without the user speaking, default is "Sorry, I didn't hear you clearly. Can you repeat that?"
     */
    public String getNotifyMessage() {
        return this.NotifyMessage;
    }

    /**
     * Set The AI prompt when NotifyDuration has passed without the user speaking, default is "Sorry, I didn't hear you clearly. Can you repeat that?"
     * @param NotifyMessage The AI prompt when NotifyDuration has passed without the user speaking, default is "Sorry, I didn't hear you clearly. Can you repeat that?"
     */
    public void setNotifyMessage(String NotifyMessage) {
        this.NotifyMessage = NotifyMessage;
    }

    /**
     * Get Maximum number of times to trigger ai prompt sound, unlimited by default. 
     * @return NotifyMaxCount Maximum number of times to trigger ai prompt sound, unlimited by default.
     */
    public Long getNotifyMaxCount() {
        return this.NotifyMaxCount;
    }

    /**
     * Set Maximum number of times to trigger ai prompt sound, unlimited by default.
     * @param NotifyMaxCount Maximum number of times to trigger ai prompt sound, unlimited by default.
     */
    public void setNotifyMaxCount(Long NotifyMaxCount) {
        this.NotifyMaxCount = NotifyMaxCount;
    }

    /**
     * Get <p>Either the VoiceType field or a custom TTS is required. this uses your own custom TTS, while VoiceType provides some built-in voice types.</p>.
<ul>
<li>Tencent TTS<br>
For configuration, see <a href="https://www.tencentcloud.comom/document/product/1073/92668?from_cn_redirect=1#55924b56-1a73-4663-a7a1-a8dd82d6e823" target="_blank">tencent cloud TTS documentation link</a></li>.
</ul>
<div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{ 
"TTSType": "tencent", // String TTS type. currently supports "tencent" and "minixmax". the rest manufacturers are under support.
  "AppId": "your application ID", // String required.
  "SecretId": "your key ID", // String required.
  "SecretKey": "your Key", // String required.
  "VoiceType": 101001, // Integer  required. the voice ID, including standard timbre and premium timbre. premium timbre has higher fidelity and different pricing from standard timbre. please refer to the text to speech billing overview. for the complete supported timbre list, see the text to speech timbre list.
  "Speed": 1.25, // Integer optional, speaking rate, value range: [-2,6], respectively represent different speaking rates: -2: 0.6x -1: 0.8x 0: 1.0x (default) 1: 1.2x 2: 1.5x 6: 2.5x. if more refined speaking rates are needed, up to 2 decimal places can be retained, such as 0.5, 1.25, or 2.81. for parameter value to actual speech Speed conversion, refer to speech Speed switch.
  "Volume": 5, // Integer optional. specifies the Volume level. value range: [0,10], corresponding to 11 severity levels respectively. default value: 0, which represents normal Volume.
  "PrimaryLanguage": 1, // Integer option primary language 1-chinese (default) 2-english 3-japanese.
"FastVoiceType": "xxxx"   //  optional parameter. parameters for quick voice clone. 
  }
</code></pre>
 </div><ul>
<li>Minimax TTS<br>
For configuration, refer to the <a href="https://platform.minimaxi.com/document/T2a%20V2?key=66719005a427f0c8a5701643" target="_blank">Minimax TTS documentation link</a>. note that Minimax TTS has frequency limits. overfrequency may result in response delays. see the <a href="https://platform.minimaxi.com/document/Rate%20limits?key=66b19417290299a26b234572" target="_blank">Minimax TTS frequency limit documentation link</a>.</li>.
</ul>
<div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{
"TTSType": "minimax",  // String TTS type. 
        &quot;Model&quot;: &quot;speech-01-turbo&quot;,
        &quot;APIUrl&quot;: &quot;https://api.minimax.chat/v1/t2a_v2&quot;,
        &quot;APIKey&quot;: &quot;eyxxxx&quot;,
        &quot;GroupId&quot;: &quot;181000000000000&quot;,
        &quot;VoiceType&quot;:&quot;female-tianmei&quot;,
        &quot;Speed&quot;: 1.2
}
</code></pre>
</div><ul>
<li>Volcano TTS</li>.
</ul>
<p>Configure the timbre type. see <a href="https://www.volcengine.com/docs/6561/162929" target="_blank">volcano TTS documentation link</a><br>.
Text to speech timbre list - voice technology - volcano engine.
Large model TTS timbre list - voice technology - volcano engine</p>.
<div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{
"TTSType": "volcengine",  // required: String TTS type.
"AppId": "xxxxxxxx",   // required: String AppId assigned by volcano engine.
"Token": "TY9d4sQXHxxxxxxx", // required: String type, access Token for volcano engine.
"Speed": 1.0,            // optional parameter. speaking rate, defaults to 1.0.
"Volume": 1.0,            // optional parameter, Volume, defaults to 1.0.
"Cluster": "volcano_tts", // optional parameter, business Cluster, is selected by default.
"VoiceType": "zh_male_aojiaobazong_moon_bigtts" // timbre type, defaults to the TTS voice type of the large model. if using ordinary text to speech, you need to fill in the corresponding voice type. input errors in voice type can cause no sound.
}
</code></pre>
</div><ul>
<li>Azure TTS<br>
For configuration, refer to the <a href="https://docs.azure.cn/zh-cn/ai-services/speech-service/speech-synthesis-markup-voice" target="_blank">AzureTTS documentation link</a></li>.
</ul>
<div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{
"TTSType": "azure", // required: String TTS type.
"SubscriptionKey": "xxxxxxxx", // required: String subscription Key.
"Region": "chinanorth3",  // required: String the Region to subscribe to.
"VoiceName": "zh-CN-XiaoxiaoNeural", // required: String specifies the required VoiceName.
"Language": "zh-CN", // required: String specifies the synthesis Language.  
"Rate": 1 // optional: float, speech speed. value range: 0.5–2. default is 1.
}
</code></pre>
</div><ul>
<li>Custom TTS</li>.
</ul>
<p>For the specific protocol specification, refer to <a href="https://doc.weixin.qq.com/doc/w3_ANQAiAbdAFwHILbJBmtSqSbV1WZ3L?scode=AJEAIQdfAAo5a1xajYANQAiAbdAFw" target="_blank">tencent documentation</a></p>.
<div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{
"TTSType": "custom", // String required.
"APIKey": "APIKey", // String required. be used to authenticate.
"APIUrl": "http://0.0.0.0:8080/stream-audio" // String, required, TTS API URL.
"AudioFormat": "wav", // String, optional, specifies the desired audio format, such as mp3, ogg_opus, pcm, wav. defaults to wav. currently only support pcm and wav.
"SampleRate": 16000,  // Integer, optional, audio sample rate, defaults to 16000 (16k), recommended value is 16000.
"AudioChannel": 1,    // Integer, optional, audio channel quantity. valid values: 1 or 2. default is 1.  
}
</code></pre>
</div> 
     * @return CustomTTSConfig <p>Either the VoiceType field or a custom TTS is required. this uses your own custom TTS, while VoiceType provides some built-in voice types.</p>.
<ul>
<li>Tencent TTS<br>
For configuration, see <a href="https://www.tencentcloud.comom/document/product/1073/92668?from_cn_redirect=1#55924b56-1a73-4663-a7a1-a8dd82d6e823" target="_blank">tencent cloud TTS documentation link</a></li>.
</ul>
<div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{ 
"TTSType": "tencent", // String TTS type. currently supports "tencent" and "minixmax". the rest manufacturers are under support.
  "AppId": "your application ID", // String required.
  "SecretId": "your key ID", // String required.
  "SecretKey": "your Key", // String required.
  "VoiceType": 101001, // Integer  required. the voice ID, including standard timbre and premium timbre. premium timbre has higher fidelity and different pricing from standard timbre. please refer to the text to speech billing overview. for the complete supported timbre list, see the text to speech timbre list.
  "Speed": 1.25, // Integer optional, speaking rate, value range: [-2,6], respectively represent different speaking rates: -2: 0.6x -1: 0.8x 0: 1.0x (default) 1: 1.2x 2: 1.5x 6: 2.5x. if more refined speaking rates are needed, up to 2 decimal places can be retained, such as 0.5, 1.25, or 2.81. for parameter value to actual speech Speed conversion, refer to speech Speed switch.
  "Volume": 5, // Integer optional. specifies the Volume level. value range: [0,10], corresponding to 11 severity levels respectively. default value: 0, which represents normal Volume.
  "PrimaryLanguage": 1, // Integer option primary language 1-chinese (default) 2-english 3-japanese.
"FastVoiceType": "xxxx"   //  optional parameter. parameters for quick voice clone. 
  }
</code></pre>
 </div><ul>
<li>Minimax TTS<br>
For configuration, refer to the <a href="https://platform.minimaxi.com/document/T2a%20V2?key=66719005a427f0c8a5701643" target="_blank">Minimax TTS documentation link</a>. note that Minimax TTS has frequency limits. overfrequency may result in response delays. see the <a href="https://platform.minimaxi.com/document/Rate%20limits?key=66b19417290299a26b234572" target="_blank">Minimax TTS frequency limit documentation link</a>.</li>.
</ul>
<div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{
"TTSType": "minimax",  // String TTS type. 
        &quot;Model&quot;: &quot;speech-01-turbo&quot;,
        &quot;APIUrl&quot;: &quot;https://api.minimax.chat/v1/t2a_v2&quot;,
        &quot;APIKey&quot;: &quot;eyxxxx&quot;,
        &quot;GroupId&quot;: &quot;181000000000000&quot;,
        &quot;VoiceType&quot;:&quot;female-tianmei&quot;,
        &quot;Speed&quot;: 1.2
}
</code></pre>
</div><ul>
<li>Volcano TTS</li>.
</ul>
<p>Configure the timbre type. see <a href="https://www.volcengine.com/docs/6561/162929" target="_blank">volcano TTS documentation link</a><br>.
Text to speech timbre list - voice technology - volcano engine.
Large model TTS timbre list - voice technology - volcano engine</p>.
<div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{
"TTSType": "volcengine",  // required: String TTS type.
"AppId": "xxxxxxxx",   // required: String AppId assigned by volcano engine.
"Token": "TY9d4sQXHxxxxxxx", // required: String type, access Token for volcano engine.
"Speed": 1.0,            // optional parameter. speaking rate, defaults to 1.0.
"Volume": 1.0,            // optional parameter, Volume, defaults to 1.0.
"Cluster": "volcano_tts", // optional parameter, business Cluster, is selected by default.
"VoiceType": "zh_male_aojiaobazong_moon_bigtts" // timbre type, defaults to the TTS voice type of the large model. if using ordinary text to speech, you need to fill in the corresponding voice type. input errors in voice type can cause no sound.
}
</code></pre>
</div><ul>
<li>Azure TTS<br>
For configuration, refer to the <a href="https://docs.azure.cn/zh-cn/ai-services/speech-service/speech-synthesis-markup-voice" target="_blank">AzureTTS documentation link</a></li>.
</ul>
<div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{
"TTSType": "azure", // required: String TTS type.
"SubscriptionKey": "xxxxxxxx", // required: String subscription Key.
"Region": "chinanorth3",  // required: String the Region to subscribe to.
"VoiceName": "zh-CN-XiaoxiaoNeural", // required: String specifies the required VoiceName.
"Language": "zh-CN", // required: String specifies the synthesis Language.  
"Rate": 1 // optional: float, speech speed. value range: 0.5–2. default is 1.
}
</code></pre>
</div><ul>
<li>Custom TTS</li>.
</ul>
<p>For the specific protocol specification, refer to <a href="https://doc.weixin.qq.com/doc/w3_ANQAiAbdAFwHILbJBmtSqSbV1WZ3L?scode=AJEAIQdfAAo5a1xajYANQAiAbdAFw" target="_blank">tencent documentation</a></p>.
<div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{
"TTSType": "custom", // String required.
"APIKey": "APIKey", // String required. be used to authenticate.
"APIUrl": "http://0.0.0.0:8080/stream-audio" // String, required, TTS API URL.
"AudioFormat": "wav", // String, optional, specifies the desired audio format, such as mp3, ogg_opus, pcm, wav. defaults to wav. currently only support pcm and wav.
"SampleRate": 16000,  // Integer, optional, audio sample rate, defaults to 16000 (16k), recommended value is 16000.
"AudioChannel": 1,    // Integer, optional, audio channel quantity. valid values: 1 or 2. default is 1.  
}
</code></pre>
</div>
     */
    public String getCustomTTSConfig() {
        return this.CustomTTSConfig;
    }

    /**
     * Set <p>Either the VoiceType field or a custom TTS is required. this uses your own custom TTS, while VoiceType provides some built-in voice types.</p>.
<ul>
<li>Tencent TTS<br>
For configuration, see <a href="https://www.tencentcloud.comom/document/product/1073/92668?from_cn_redirect=1#55924b56-1a73-4663-a7a1-a8dd82d6e823" target="_blank">tencent cloud TTS documentation link</a></li>.
</ul>
<div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{ 
"TTSType": "tencent", // String TTS type. currently supports "tencent" and "minixmax". the rest manufacturers are under support.
  "AppId": "your application ID", // String required.
  "SecretId": "your key ID", // String required.
  "SecretKey": "your Key", // String required.
  "VoiceType": 101001, // Integer  required. the voice ID, including standard timbre and premium timbre. premium timbre has higher fidelity and different pricing from standard timbre. please refer to the text to speech billing overview. for the complete supported timbre list, see the text to speech timbre list.
  "Speed": 1.25, // Integer optional, speaking rate, value range: [-2,6], respectively represent different speaking rates: -2: 0.6x -1: 0.8x 0: 1.0x (default) 1: 1.2x 2: 1.5x 6: 2.5x. if more refined speaking rates are needed, up to 2 decimal places can be retained, such as 0.5, 1.25, or 2.81. for parameter value to actual speech Speed conversion, refer to speech Speed switch.
  "Volume": 5, // Integer optional. specifies the Volume level. value range: [0,10], corresponding to 11 severity levels respectively. default value: 0, which represents normal Volume.
  "PrimaryLanguage": 1, // Integer option primary language 1-chinese (default) 2-english 3-japanese.
"FastVoiceType": "xxxx"   //  optional parameter. parameters for quick voice clone. 
  }
</code></pre>
 </div><ul>
<li>Minimax TTS<br>
For configuration, refer to the <a href="https://platform.minimaxi.com/document/T2a%20V2?key=66719005a427f0c8a5701643" target="_blank">Minimax TTS documentation link</a>. note that Minimax TTS has frequency limits. overfrequency may result in response delays. see the <a href="https://platform.minimaxi.com/document/Rate%20limits?key=66b19417290299a26b234572" target="_blank">Minimax TTS frequency limit documentation link</a>.</li>.
</ul>
<div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{
"TTSType": "minimax",  // String TTS type. 
        &quot;Model&quot;: &quot;speech-01-turbo&quot;,
        &quot;APIUrl&quot;: &quot;https://api.minimax.chat/v1/t2a_v2&quot;,
        &quot;APIKey&quot;: &quot;eyxxxx&quot;,
        &quot;GroupId&quot;: &quot;181000000000000&quot;,
        &quot;VoiceType&quot;:&quot;female-tianmei&quot;,
        &quot;Speed&quot;: 1.2
}
</code></pre>
</div><ul>
<li>Volcano TTS</li>.
</ul>
<p>Configure the timbre type. see <a href="https://www.volcengine.com/docs/6561/162929" target="_blank">volcano TTS documentation link</a><br>.
Text to speech timbre list - voice technology - volcano engine.
Large model TTS timbre list - voice technology - volcano engine</p>.
<div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{
"TTSType": "volcengine",  // required: String TTS type.
"AppId": "xxxxxxxx",   // required: String AppId assigned by volcano engine.
"Token": "TY9d4sQXHxxxxxxx", // required: String type, access Token for volcano engine.
"Speed": 1.0,            // optional parameter. speaking rate, defaults to 1.0.
"Volume": 1.0,            // optional parameter, Volume, defaults to 1.0.
"Cluster": "volcano_tts", // optional parameter, business Cluster, is selected by default.
"VoiceType": "zh_male_aojiaobazong_moon_bigtts" // timbre type, defaults to the TTS voice type of the large model. if using ordinary text to speech, you need to fill in the corresponding voice type. input errors in voice type can cause no sound.
}
</code></pre>
</div><ul>
<li>Azure TTS<br>
For configuration, refer to the <a href="https://docs.azure.cn/zh-cn/ai-services/speech-service/speech-synthesis-markup-voice" target="_blank">AzureTTS documentation link</a></li>.
</ul>
<div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{
"TTSType": "azure", // required: String TTS type.
"SubscriptionKey": "xxxxxxxx", // required: String subscription Key.
"Region": "chinanorth3",  // required: String the Region to subscribe to.
"VoiceName": "zh-CN-XiaoxiaoNeural", // required: String specifies the required VoiceName.
"Language": "zh-CN", // required: String specifies the synthesis Language.  
"Rate": 1 // optional: float, speech speed. value range: 0.5–2. default is 1.
}
</code></pre>
</div><ul>
<li>Custom TTS</li>.
</ul>
<p>For the specific protocol specification, refer to <a href="https://doc.weixin.qq.com/doc/w3_ANQAiAbdAFwHILbJBmtSqSbV1WZ3L?scode=AJEAIQdfAAo5a1xajYANQAiAbdAFw" target="_blank">tencent documentation</a></p>.
<div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{
"TTSType": "custom", // String required.
"APIKey": "APIKey", // String required. be used to authenticate.
"APIUrl": "http://0.0.0.0:8080/stream-audio" // String, required, TTS API URL.
"AudioFormat": "wav", // String, optional, specifies the desired audio format, such as mp3, ogg_opus, pcm, wav. defaults to wav. currently only support pcm and wav.
"SampleRate": 16000,  // Integer, optional, audio sample rate, defaults to 16000 (16k), recommended value is 16000.
"AudioChannel": 1,    // Integer, optional, audio channel quantity. valid values: 1 or 2. default is 1.  
}
</code></pre>
</div>
     * @param CustomTTSConfig <p>Either the VoiceType field or a custom TTS is required. this uses your own custom TTS, while VoiceType provides some built-in voice types.</p>.
<ul>
<li>Tencent TTS<br>
For configuration, see <a href="https://www.tencentcloud.comom/document/product/1073/92668?from_cn_redirect=1#55924b56-1a73-4663-a7a1-a8dd82d6e823" target="_blank">tencent cloud TTS documentation link</a></li>.
</ul>
<div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{ 
"TTSType": "tencent", // String TTS type. currently supports "tencent" and "minixmax". the rest manufacturers are under support.
  "AppId": "your application ID", // String required.
  "SecretId": "your key ID", // String required.
  "SecretKey": "your Key", // String required.
  "VoiceType": 101001, // Integer  required. the voice ID, including standard timbre and premium timbre. premium timbre has higher fidelity and different pricing from standard timbre. please refer to the text to speech billing overview. for the complete supported timbre list, see the text to speech timbre list.
  "Speed": 1.25, // Integer optional, speaking rate, value range: [-2,6], respectively represent different speaking rates: -2: 0.6x -1: 0.8x 0: 1.0x (default) 1: 1.2x 2: 1.5x 6: 2.5x. if more refined speaking rates are needed, up to 2 decimal places can be retained, such as 0.5, 1.25, or 2.81. for parameter value to actual speech Speed conversion, refer to speech Speed switch.
  "Volume": 5, // Integer optional. specifies the Volume level. value range: [0,10], corresponding to 11 severity levels respectively. default value: 0, which represents normal Volume.
  "PrimaryLanguage": 1, // Integer option primary language 1-chinese (default) 2-english 3-japanese.
"FastVoiceType": "xxxx"   //  optional parameter. parameters for quick voice clone. 
  }
</code></pre>
 </div><ul>
<li>Minimax TTS<br>
For configuration, refer to the <a href="https://platform.minimaxi.com/document/T2a%20V2?key=66719005a427f0c8a5701643" target="_blank">Minimax TTS documentation link</a>. note that Minimax TTS has frequency limits. overfrequency may result in response delays. see the <a href="https://platform.minimaxi.com/document/Rate%20limits?key=66b19417290299a26b234572" target="_blank">Minimax TTS frequency limit documentation link</a>.</li>.
</ul>
<div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{
"TTSType": "minimax",  // String TTS type. 
        &quot;Model&quot;: &quot;speech-01-turbo&quot;,
        &quot;APIUrl&quot;: &quot;https://api.minimax.chat/v1/t2a_v2&quot;,
        &quot;APIKey&quot;: &quot;eyxxxx&quot;,
        &quot;GroupId&quot;: &quot;181000000000000&quot;,
        &quot;VoiceType&quot;:&quot;female-tianmei&quot;,
        &quot;Speed&quot;: 1.2
}
</code></pre>
</div><ul>
<li>Volcano TTS</li>.
</ul>
<p>Configure the timbre type. see <a href="https://www.volcengine.com/docs/6561/162929" target="_blank">volcano TTS documentation link</a><br>.
Text to speech timbre list - voice technology - volcano engine.
Large model TTS timbre list - voice technology - volcano engine</p>.
<div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{
"TTSType": "volcengine",  // required: String TTS type.
"AppId": "xxxxxxxx",   // required: String AppId assigned by volcano engine.
"Token": "TY9d4sQXHxxxxxxx", // required: String type, access Token for volcano engine.
"Speed": 1.0,            // optional parameter. speaking rate, defaults to 1.0.
"Volume": 1.0,            // optional parameter, Volume, defaults to 1.0.
"Cluster": "volcano_tts", // optional parameter, business Cluster, is selected by default.
"VoiceType": "zh_male_aojiaobazong_moon_bigtts" // timbre type, defaults to the TTS voice type of the large model. if using ordinary text to speech, you need to fill in the corresponding voice type. input errors in voice type can cause no sound.
}
</code></pre>
</div><ul>
<li>Azure TTS<br>
For configuration, refer to the <a href="https://docs.azure.cn/zh-cn/ai-services/speech-service/speech-synthesis-markup-voice" target="_blank">AzureTTS documentation link</a></li>.
</ul>
<div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{
"TTSType": "azure", // required: String TTS type.
"SubscriptionKey": "xxxxxxxx", // required: String subscription Key.
"Region": "chinanorth3",  // required: String the Region to subscribe to.
"VoiceName": "zh-CN-XiaoxiaoNeural", // required: String specifies the required VoiceName.
"Language": "zh-CN", // required: String specifies the synthesis Language.  
"Rate": 1 // optional: float, speech speed. value range: 0.5–2. default is 1.
}
</code></pre>
</div><ul>
<li>Custom TTS</li>.
</ul>
<p>For the specific protocol specification, refer to <a href="https://doc.weixin.qq.com/doc/w3_ANQAiAbdAFwHILbJBmtSqSbV1WZ3L?scode=AJEAIQdfAAo5a1xajYANQAiAbdAFw" target="_blank">tencent documentation</a></p>.
<div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{
"TTSType": "custom", // String required.
"APIKey": "APIKey", // String required. be used to authenticate.
"APIUrl": "http://0.0.0.0:8080/stream-audio" // String, required, TTS API URL.
"AudioFormat": "wav", // String, optional, specifies the desired audio format, such as mp3, ogg_opus, pcm, wav. defaults to wav. currently only support pcm and wav.
"SampleRate": 16000,  // Integer, optional, audio sample rate, defaults to 16000 (16k), recommended value is 16000.
"AudioChannel": 1,    // Integer, optional, audio channel quantity. valid values: 1 or 2. default is 1.  
}
</code></pre>
</div>
     */
    public void setCustomTTSConfig(String CustomTTSConfig) {
        this.CustomTTSConfig = CustomTTSConfig;
    }

    /**
     * Get Prompt word variable. 
     * @return PromptVariables Prompt word variable.
     * @deprecated
     */
    @Deprecated
    public Variable [] getPromptVariables() {
        return this.PromptVariables;
    }

    /**
     * Set Prompt word variable.
     * @param PromptVariables Prompt word variable.
     * @deprecated
     */
    @Deprecated
    public void setPromptVariables(Variable [] PromptVariables) {
        this.PromptVariables = PromptVariables;
    }

    /**
     * Get Automatic speech recognition vad time ranges from 240 to 2000, with a default of 1000, measured in milliseconds. smaller values will make automatic speech recognition segment faster. 
     * @return VadSilenceTime Automatic speech recognition vad time ranges from 240 to 2000, with a default of 1000, measured in milliseconds. smaller values will make automatic speech recognition segment faster.
     */
    public Long getVadSilenceTime() {
        return this.VadSilenceTime;
    }

    /**
     * Set Automatic speech recognition vad time ranges from 240 to 2000, with a default of 1000, measured in milliseconds. smaller values will make automatic speech recognition segment faster.
     * @param VadSilenceTime Automatic speech recognition vad time ranges from 240 to 2000, with a default of 1000, measured in milliseconds. smaller values will make automatic speech recognition segment faster.
     */
    public void setVadSilenceTime(Long VadSilenceTime) {
        this.VadSilenceTime = VadSilenceTime;
    }

    /**
     * Get Call content extraction configuration. 
     * @return ExtractConfig Call content extraction configuration.
     */
    public AICallExtractConfigElement [] getExtractConfig() {
        return this.ExtractConfig;
    }

    /**
     * Set Call content extraction configuration.
     * @param ExtractConfig Call content extraction configuration.
     */
    public void setExtractConfig(AICallExtractConfigElement [] ExtractConfig) {
        this.ExtractConfig = ExtractConfig;
    }

    /**
     * Get Model temperature control. 
     * @return Temperature Model temperature control.
     */
    public Float getTemperature() {
        return this.Temperature;
    }

    /**
     * Set Model temperature control.
     * @param Temperature Model temperature control.
     */
    public void setTemperature(Float Temperature) {
        this.Temperature = Temperature;
    }

    /**
     * Get Common variable: <p>prompt content variable</p> <p>welcome message variable</p> <p>welcome message delay playback (in seconds): welcome-message-delay</p> <p>dify variable</p>.  

dify-inputs-xxx specifies the inputs variable for dify.
2. the dify-inputs-user specifies the user value for dify.
3. dify-inputs-conversation_id is the conversation_id value of dify. 
     * @return Variables Common variable: <p>prompt content variable</p> <p>welcome message variable</p> <p>welcome message delay playback (in seconds): welcome-message-delay</p> <p>dify variable</p>.  

dify-inputs-xxx specifies the inputs variable for dify.
2. the dify-inputs-user specifies the user value for dify.
3. dify-inputs-conversation_id is the conversation_id value of dify.
     */
    public Variable [] getVariables() {
        return this.Variables;
    }

    /**
     * Set Common variable: <p>prompt content variable</p> <p>welcome message variable</p> <p>welcome message delay playback (in seconds): welcome-message-delay</p> <p>dify variable</p>.  

dify-inputs-xxx specifies the inputs variable for dify.
2. the dify-inputs-user specifies the user value for dify.
3. dify-inputs-conversation_id is the conversation_id value of dify.
     * @param Variables Common variable: <p>prompt content variable</p> <p>welcome message variable</p> <p>welcome message delay playback (in seconds): welcome-message-delay</p> <p>dify variable</p>.  

dify-inputs-xxx specifies the inputs variable for dify.
2. the dify-inputs-user specifies the user value for dify.
3. dify-inputs-conversation_id is the conversation_id value of dify.
     */
    public void setVariables(Variable [] Variables) {
        this.Variables = Variables;
    }

    /**
     * Get Specifies the model topP. 
     * @return TopP Specifies the model topP.
     */
    public Float getTopP() {
        return this.TopP;
    }

    /**
     * Set Specifies the model topP.
     * @param TopP Specifies the model topP.
     */
    public void setTopP(Float TopP) {
        this.TopP = TopP;
    }

    /**
     * Get The vad far-field voice suppression capacity (does not impact asr recognition performance). value range: [0, 3]. default is 0. recommended setting: 2 for better far-field voice suppression. 
     * @return VadLevel The vad far-field voice suppression capacity (does not impact asr recognition performance). value range: [0, 3]. default is 0. recommended setting: 2 for better far-field voice suppression.
     */
    public Long getVadLevel() {
        return this.VadLevel;
    }

    /**
     * Set The vad far-field voice suppression capacity (does not impact asr recognition performance). value range: [0, 3]. default is 0. recommended setting: 2 for better far-field voice suppression.
     * @param VadLevel The vad far-field voice suppression capacity (does not impact asr recognition performance). value range: [0, 3]. default is 0. recommended setting: 2 for better far-field voice suppression.
     */
    public void setVadLevel(Long VadLevel) {
        this.VadLevel = VadLevel;
    }

    /**
     * Get Transition. 
     * @return ToneWord Transition.
     */
    public ToneWordInfo getToneWord() {
        return this.ToneWord;
    }

    /**
     * Set Transition.
     * @param ToneWord Transition.
     */
    public void setToneWord(ToneWordInfo ToneWord) {
        this.ToneWord = ToneWord;
    }

    /**
     * Get Compliant prompt sound. 
This parameter set to true (default) means call initiation plays morse code, with a Note that the conversation content is AI-generated.
Passing 'false' to this parameter disables the compliance prompt sound. passing 'false' signifies you have read and agree to the following agreement:.
Our side fully acknowledges and understands that according to the laws and regulations specified in the "cybersecurity law" (https://www.cac.gov.cn/2016-11/07/c_1119867116.htm), "provision on administration of deep synthesis of internet-based information service" (https://www.gov.cn/zhengce/zhengceku/2022-12/12/content_5731431.htm), "interim measures for the management of generative artificial intelligence services" (https://www.gov.cn/zhengce/zhengceku/202307/content_6891752.htm), and "measures for the identification of artificial intelligence-generated synthetic content" (https://www.gov.cn/zhengce/zhengceku/202503/content_7014286.htm), explicit and implicit identification should be added to ai-generated synthetic content. based on business requirements, we request tencent cloud not to add explicit identification to generated synthetic content. we commit to lawful and compliant use of generated synthetic content to avoid causing confusion or misunderstanding. if the generated synthetic content is used to provide services to the public or spread over networks, we will proactively add explicit identification that complies with legal provisions and national standards, and bear the legal obligation for identifying ai-generated synthetic content. our side will fully assume all related responsibilities if adverse consequences arise from failure to appropriately and reasonably fulfill the obligation of ai content identification, or if penalties are imposed by the competent department. 
     * @return EnableComplianceAudio Compliant prompt sound. 
This parameter set to true (default) means call initiation plays morse code, with a Note that the conversation content is AI-generated.
Passing 'false' to this parameter disables the compliance prompt sound. passing 'false' signifies you have read and agree to the following agreement:.
Our side fully acknowledges and understands that according to the laws and regulations specified in the "cybersecurity law" (https://www.cac.gov.cn/2016-11/07/c_1119867116.htm), "provision on administration of deep synthesis of internet-based information service" (https://www.gov.cn/zhengce/zhengceku/2022-12/12/content_5731431.htm), "interim measures for the management of generative artificial intelligence services" (https://www.gov.cn/zhengce/zhengceku/202307/content_6891752.htm), and "measures for the identification of artificial intelligence-generated synthetic content" (https://www.gov.cn/zhengce/zhengceku/202503/content_7014286.htm), explicit and implicit identification should be added to ai-generated synthetic content. based on business requirements, we request tencent cloud not to add explicit identification to generated synthetic content. we commit to lawful and compliant use of generated synthetic content to avoid causing confusion or misunderstanding. if the generated synthetic content is used to provide services to the public or spread over networks, we will proactively add explicit identification that complies with legal provisions and national standards, and bear the legal obligation for identifying ai-generated synthetic content. our side will fully assume all related responsibilities if adverse consequences arise from failure to appropriately and reasonably fulfill the obligation of ai content identification, or if penalties are imposed by the competent department.
     */
    public Boolean getEnableComplianceAudio() {
        return this.EnableComplianceAudio;
    }

    /**
     * Set Compliant prompt sound. 
This parameter set to true (default) means call initiation plays morse code, with a Note that the conversation content is AI-generated.
Passing 'false' to this parameter disables the compliance prompt sound. passing 'false' signifies you have read and agree to the following agreement:.
Our side fully acknowledges and understands that according to the laws and regulations specified in the "cybersecurity law" (https://www.cac.gov.cn/2016-11/07/c_1119867116.htm), "provision on administration of deep synthesis of internet-based information service" (https://www.gov.cn/zhengce/zhengceku/2022-12/12/content_5731431.htm), "interim measures for the management of generative artificial intelligence services" (https://www.gov.cn/zhengce/zhengceku/202307/content_6891752.htm), and "measures for the identification of artificial intelligence-generated synthetic content" (https://www.gov.cn/zhengce/zhengceku/202503/content_7014286.htm), explicit and implicit identification should be added to ai-generated synthetic content. based on business requirements, we request tencent cloud not to add explicit identification to generated synthetic content. we commit to lawful and compliant use of generated synthetic content to avoid causing confusion or misunderstanding. if the generated synthetic content is used to provide services to the public or spread over networks, we will proactively add explicit identification that complies with legal provisions and national standards, and bear the legal obligation for identifying ai-generated synthetic content. our side will fully assume all related responsibilities if adverse consequences arise from failure to appropriately and reasonably fulfill the obligation of ai content identification, or if penalties are imposed by the competent department.
     * @param EnableComplianceAudio Compliant prompt sound. 
This parameter set to true (default) means call initiation plays morse code, with a Note that the conversation content is AI-generated.
Passing 'false' to this parameter disables the compliance prompt sound. passing 'false' signifies you have read and agree to the following agreement:.
Our side fully acknowledges and understands that according to the laws and regulations specified in the "cybersecurity law" (https://www.cac.gov.cn/2016-11/07/c_1119867116.htm), "provision on administration of deep synthesis of internet-based information service" (https://www.gov.cn/zhengce/zhengceku/2022-12/12/content_5731431.htm), "interim measures for the management of generative artificial intelligence services" (https://www.gov.cn/zhengce/zhengceku/202307/content_6891752.htm), and "measures for the identification of artificial intelligence-generated synthetic content" (https://www.gov.cn/zhengce/zhengceku/202503/content_7014286.htm), explicit and implicit identification should be added to ai-generated synthetic content. based on business requirements, we request tencent cloud not to add explicit identification to generated synthetic content. we commit to lawful and compliant use of generated synthetic content to avoid causing confusion or misunderstanding. if the generated synthetic content is used to provide services to the public or spread over networks, we will proactively add explicit identification that complies with legal provisions and national standards, and bear the legal obligation for identifying ai-generated synthetic content. our side will fully assume all related responsibilities if adverse consequences arise from failure to appropriately and reasonably fulfill the obligation of ai content identification, or if penalties are imposed by the competent department.
     */
    public void setEnableComplianceAudio(Boolean EnableComplianceAudio) {
        this.EnableComplianceAudio = EnableComplianceAudio;
    }

    /**
     * Get Whether to enable voice mail recognition. 
     * @return EnableVoicemailDetection Whether to enable voice mail recognition.
     */
    public Boolean getEnableVoicemailDetection() {
        return this.EnableVoicemailDetection;
    }

    /**
     * Set Whether to enable voice mail recognition.
     * @param EnableVoicemailDetection Whether to enable voice mail recognition.
     */
    public void setEnableVoicemailDetection(Boolean EnableVoicemailDetection) {
        this.EnableVoicemailDetection = EnableVoicemailDetection;
    }

    /**
     * Get Detect behavior when the peer is voice mail. this parameter is valid only when EnableVoicemailDetection is True.
0: hang up the phone (default). 
     * @return VoicemailAction Detect behavior when the peer is voice mail. this parameter is valid only when EnableVoicemailDetection is True.
0: hang up the phone (default).
     */
    public Long getVoicemailAction() {
        return this.VoicemailAction;
    }

    /**
     * Set Detect behavior when the peer is voice mail. this parameter is valid only when EnableVoicemailDetection is True.
0: hang up the phone (default).
     * @param VoicemailAction Detect behavior when the peer is voice mail. this parameter is valid only when EnableVoicemailDetection is True.
0: hang up the phone (default).
     */
    public void setVoicemailAction(Long VoicemailAction) {
        this.VoicemailAction = VoicemailAction;
    }

    /**
     * Get Large model extended parameter, format is json string. 
     * @return LLMExtraBody Large model extended parameter, format is json string.
     */
    public String getLLMExtraBody() {
        return this.LLMExtraBody;
    }

    /**
     * Set Large model extended parameter, format is json string.
     * @param LLMExtraBody Large model extended parameter, format is json string.
     */
    public void setLLMExtraBody(String LLMExtraBody) {
        this.LLMExtraBody = LLMExtraBody;
    }

    /**
     * Get Maximum call duration, default not limited. unit: milliseconds (ms). 
     * @return MaxCallDurationMs Maximum call duration, default not limited. unit: milliseconds (ms).
     */
    public Long getMaxCallDurationMs() {
        return this.MaxCallDurationMs;
    }

    /**
     * Set Maximum call duration, default not limited. unit: milliseconds (ms).
     * @param MaxCallDurationMs Maximum call duration, default not limited. unit: milliseconds (ms).
     */
    public void setMaxCallDurationMs(Long MaxCallDurationMs) {
        this.MaxCallDurationMs = MaxCallDurationMs;
    }

    /**
     * Get Maximum ringing duration. auto hang up when the duration threshold is reached. **only own number supports current parameter.**. 
     * @return MaxRingTimeoutSecond Maximum ringing duration. auto hang up when the duration threshold is reached. **only own number supports current parameter.**.
     */
    public Long getMaxRingTimeoutSecond() {
        return this.MaxRingTimeoutSecond;
    }

    /**
     * Set Maximum ringing duration. auto hang up when the duration threshold is reached. **only own number supports current parameter.**.
     * @param MaxRingTimeoutSecond Maximum ringing duration. auto hang up when the duration threshold is reached. **only own number supports current parameter.**.
     */
    public void setMaxRingTimeoutSecond(Long MaxRingTimeoutSecond) {
        this.MaxRingTimeoutSecond = MaxRingTimeoutSecond;
    }

    public CreateAICallRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAICallRequest(CreateAICallRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.Callee != null) {
            this.Callee = new String(source.Callee);
        }
        if (source.LLMType != null) {
            this.LLMType = new String(source.LLMType);
        }
        if (source.APIKey != null) {
            this.APIKey = new String(source.APIKey);
        }
        if (source.APIUrl != null) {
            this.APIUrl = new String(source.APIUrl);
        }
        if (source.SystemPrompt != null) {
            this.SystemPrompt = new String(source.SystemPrompt);
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.VoiceType != null) {
            this.VoiceType = new String(source.VoiceType);
        }
        if (source.Callers != null) {
            this.Callers = new String[source.Callers.length];
            for (int i = 0; i < source.Callers.length; i++) {
                this.Callers[i] = new String(source.Callers[i]);
            }
        }
        if (source.WelcomeMessage != null) {
            this.WelcomeMessage = new String(source.WelcomeMessage);
        }
        if (source.WelcomeType != null) {
            this.WelcomeType = new Long(source.WelcomeType);
        }
        if (source.WelcomeMessagePriority != null) {
            this.WelcomeMessagePriority = new Long(source.WelcomeMessagePriority);
        }
        if (source.MaxDuration != null) {
            this.MaxDuration = new Long(source.MaxDuration);
        }
        if (source.Languages != null) {
            this.Languages = new String[source.Languages.length];
            for (int i = 0; i < source.Languages.length; i++) {
                this.Languages[i] = new String(source.Languages[i]);
            }
        }
        if (source.InterruptMode != null) {
            this.InterruptMode = new Long(source.InterruptMode);
        }
        if (source.InterruptSpeechDuration != null) {
            this.InterruptSpeechDuration = new Long(source.InterruptSpeechDuration);
        }
        if (source.EndFunctionEnable != null) {
            this.EndFunctionEnable = new Boolean(source.EndFunctionEnable);
        }
        if (source.EndFunctionDesc != null) {
            this.EndFunctionDesc = new String(source.EndFunctionDesc);
        }
        if (source.TransferFunctionEnable != null) {
            this.TransferFunctionEnable = new Boolean(source.TransferFunctionEnable);
        }
        if (source.TransferItems != null) {
            this.TransferItems = new AITransferItem[source.TransferItems.length];
            for (int i = 0; i < source.TransferItems.length; i++) {
                this.TransferItems[i] = new AITransferItem(source.TransferItems[i]);
            }
        }
        if (source.NotifyDuration != null) {
            this.NotifyDuration = new Long(source.NotifyDuration);
        }
        if (source.NotifyMessage != null) {
            this.NotifyMessage = new String(source.NotifyMessage);
        }
        if (source.NotifyMaxCount != null) {
            this.NotifyMaxCount = new Long(source.NotifyMaxCount);
        }
        if (source.CustomTTSConfig != null) {
            this.CustomTTSConfig = new String(source.CustomTTSConfig);
        }
        if (source.PromptVariables != null) {
            this.PromptVariables = new Variable[source.PromptVariables.length];
            for (int i = 0; i < source.PromptVariables.length; i++) {
                this.PromptVariables[i] = new Variable(source.PromptVariables[i]);
            }
        }
        if (source.VadSilenceTime != null) {
            this.VadSilenceTime = new Long(source.VadSilenceTime);
        }
        if (source.ExtractConfig != null) {
            this.ExtractConfig = new AICallExtractConfigElement[source.ExtractConfig.length];
            for (int i = 0; i < source.ExtractConfig.length; i++) {
                this.ExtractConfig[i] = new AICallExtractConfigElement(source.ExtractConfig[i]);
            }
        }
        if (source.Temperature != null) {
            this.Temperature = new Float(source.Temperature);
        }
        if (source.Variables != null) {
            this.Variables = new Variable[source.Variables.length];
            for (int i = 0; i < source.Variables.length; i++) {
                this.Variables[i] = new Variable(source.Variables[i]);
            }
        }
        if (source.TopP != null) {
            this.TopP = new Float(source.TopP);
        }
        if (source.VadLevel != null) {
            this.VadLevel = new Long(source.VadLevel);
        }
        if (source.ToneWord != null) {
            this.ToneWord = new ToneWordInfo(source.ToneWord);
        }
        if (source.EnableComplianceAudio != null) {
            this.EnableComplianceAudio = new Boolean(source.EnableComplianceAudio);
        }
        if (source.EnableVoicemailDetection != null) {
            this.EnableVoicemailDetection = new Boolean(source.EnableVoicemailDetection);
        }
        if (source.VoicemailAction != null) {
            this.VoicemailAction = new Long(source.VoicemailAction);
        }
        if (source.LLMExtraBody != null) {
            this.LLMExtraBody = new String(source.LLMExtraBody);
        }
        if (source.MaxCallDurationMs != null) {
            this.MaxCallDurationMs = new Long(source.MaxCallDurationMs);
        }
        if (source.MaxRingTimeoutSecond != null) {
            this.MaxRingTimeoutSecond = new Long(source.MaxRingTimeoutSecond);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "Callee", this.Callee);
        this.setParamSimple(map, prefix + "LLMType", this.LLMType);
        this.setParamSimple(map, prefix + "APIKey", this.APIKey);
        this.setParamSimple(map, prefix + "APIUrl", this.APIUrl);
        this.setParamSimple(map, prefix + "SystemPrompt", this.SystemPrompt);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "VoiceType", this.VoiceType);
        this.setParamArraySimple(map, prefix + "Callers.", this.Callers);
        this.setParamSimple(map, prefix + "WelcomeMessage", this.WelcomeMessage);
        this.setParamSimple(map, prefix + "WelcomeType", this.WelcomeType);
        this.setParamSimple(map, prefix + "WelcomeMessagePriority", this.WelcomeMessagePriority);
        this.setParamSimple(map, prefix + "MaxDuration", this.MaxDuration);
        this.setParamArraySimple(map, prefix + "Languages.", this.Languages);
        this.setParamSimple(map, prefix + "InterruptMode", this.InterruptMode);
        this.setParamSimple(map, prefix + "InterruptSpeechDuration", this.InterruptSpeechDuration);
        this.setParamSimple(map, prefix + "EndFunctionEnable", this.EndFunctionEnable);
        this.setParamSimple(map, prefix + "EndFunctionDesc", this.EndFunctionDesc);
        this.setParamSimple(map, prefix + "TransferFunctionEnable", this.TransferFunctionEnable);
        this.setParamArrayObj(map, prefix + "TransferItems.", this.TransferItems);
        this.setParamSimple(map, prefix + "NotifyDuration", this.NotifyDuration);
        this.setParamSimple(map, prefix + "NotifyMessage", this.NotifyMessage);
        this.setParamSimple(map, prefix + "NotifyMaxCount", this.NotifyMaxCount);
        this.setParamSimple(map, prefix + "CustomTTSConfig", this.CustomTTSConfig);
        this.setParamArrayObj(map, prefix + "PromptVariables.", this.PromptVariables);
        this.setParamSimple(map, prefix + "VadSilenceTime", this.VadSilenceTime);
        this.setParamArrayObj(map, prefix + "ExtractConfig.", this.ExtractConfig);
        this.setParamSimple(map, prefix + "Temperature", this.Temperature);
        this.setParamArrayObj(map, prefix + "Variables.", this.Variables);
        this.setParamSimple(map, prefix + "TopP", this.TopP);
        this.setParamSimple(map, prefix + "VadLevel", this.VadLevel);
        this.setParamObj(map, prefix + "ToneWord.", this.ToneWord);
        this.setParamSimple(map, prefix + "EnableComplianceAudio", this.EnableComplianceAudio);
        this.setParamSimple(map, prefix + "EnableVoicemailDetection", this.EnableVoicemailDetection);
        this.setParamSimple(map, prefix + "VoicemailAction", this.VoicemailAction);
        this.setParamSimple(map, prefix + "LLMExtraBody", this.LLMExtraBody);
        this.setParamSimple(map, prefix + "MaxCallDurationMs", this.MaxCallDurationMs);
        this.setParamSimple(map, prefix + "MaxRingTimeoutSecond", this.MaxRingTimeoutSecond);

    }
}

