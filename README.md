## پروژه شبیه‌سازی فروشگاه
این پروژه، سیستم پرداخت یک فروشگاه را شبیه سازی میکند که شامل دخیره سازی و نمایش خرید های تعدادی مشتری است.
# ویژگی های پروژه
*  روش های پرداخت گوناگون
*  نمایش اطلاعات هر خرید شامل اطلاعات و مبلغ و شیوه پرداخت
*  ذخیره سازی و نمایش اطلاعاتی مثل شماره کارت یا آدرس ایمیل و کیف پول و... در روش های مختلف خرید
*  وجود دو نوع مشتری ساده و ویژه
*  ذخیره و نمایش تاریخچه ی خرید های هر مشتری
# کلاس ها و اینترفیس ها:
* اینترفیس PaymentStrategy
این اینترفیس دو متود برای نمایش و ذخیره سازی اطلاعات پرداخت در اختیار کلاس هایی که آن ایمپلمنت میکنند میگذارد.

 *  کلاس CreditCardPayment
این کلاس، اینترفیس ذکر شده را ایمپلمنت میکند و شامل شماره کارت و نام صاحب کارت است.

* کلاس PayPalPayment
این کلاس هم اینترفیس ذکر شده را ایمپلمنت میکند و شامل ایمیل است.

* کلاس BitcoinPayment
این کلاس هم اینترفیس ذکر شده را ایمپلمنت میکند و شامل آدرس کیف پول است.

* کلاس ابسترکت Customer
این کلاس شامل فیلد ها و متود های مشترک مشتریان مثل نام و تاریخچه پرداخت است. و یک متود ابسترکت برای نمایش اطلاعات مشتری دارد.

* کلاس RegularCustomer
این کلاس، زیرکلاس Customer است که نشان دهنده ی یک مشتری عادی است و در متود نمایش اطلاعات مشتری، نام مشتری و عادی بودن او را نمایش میدهد.

* کلاس PremiumCustomer
این کلاس نیز زیرکلاس Customer است. نشان دهنده ی یک مشتری ویژه است که در متود نمایش اطلاعات نام مشتری و ویژه بودن او را نمایش میدهد.

# نحوه اجرا

1.دانلود و اجرای پروژه

ابتدا کد را clone کرده و در یک محیط توسعه‌ی جاوا (مانند IntelliJ IDEA) باز کنید.

2.اجرای کلاس Main

کلاس Main را اجرا کنید. تعدادی مشتری، و تعدادی روش پرداخت و تعدادی خرید در آن ایجاد شده اند و اطلاعات مربوط به آنها چاپ میشود.
