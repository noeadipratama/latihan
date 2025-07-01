# 📱 User Preference Manager (Android - Kotlin)

Aplikasi Android sederhana untuk mengelola preferensi pengguna seperti login, tema gelap/terang, dan pengaturan notifikasi menggunakan `SharedPreferences`.

---

## 🚀 Fitur Utama

- ✅ Login sederhana berbasis kredensial tetap
- 🌙 Dukungan tema gelap dan terang
- 🔔 Pengaturan notifikasi pengguna
- 💾 Penyimpanan preferensi dengan `SharedPreferences`
- 🧭 Navigasi antar activity sesuai status login

---

## 🧱 Struktur Proyek

```
app/
├── manifests/
│   └── AndroidManifest.xml
│
├── java/com.example.userpreferencemanager/
│   ├── LoginActivity.kt
│   ├── MainActivity.kt
│   ├── PrefsHelper.kt
│   ├── SettingsActivity.kt
│   └── SplashActivity.kt
│
├── res/
      │
      ├── layout/
      │   ├── activity_login.xml
      │   ├── activity_main.xml
      │   ├── activity_settings.xml
      │   └── activity_splash.xml
      │
      └── values/
         ├── colors.xml
         ├── colors.xml (night)
         ├── strings.xml
         └── styles.xml
```

---

## 🧭 Alur Aplikasi

1. **SplashActivity**

   - Menampilkan splash screen selama 2 detik.
   - Mengecek `isLoggedIn` dari `PrefsHelper`.
   - Jika `true` → navigasi ke `MainActivity`, jika `false` → ke `LoginActivity`.

2. **LoginActivity**

   - Form input username dan password.
   - Jika login benar (`admin` / `1234`), simpan login status & username ke SharedPreferences dan navigasi ke `MainActivity`.

3. **MainActivity**

   - Menampilkan:
     - Sambutan `Welcome, <username>`
     - Status notifikasi
     - Tombol Settings dan Logout
     - Tema gelap/terang diterapkan sesuai pengaturan.

4. **SettingsActivity**
   - Switch untuk:
     - Mode Gelap
     - Notifikasi
     - Menyimpan preferensi dan memberi flag `isThemeChanged = true` untuk `MainActivity`.

---

## ⚙️ Cara Setup & Menjalankan

### Prasyarat:

- Android Studio
- Emulator Android / perangkat fisik

---

## 🧪 Pengujian Aplikasi

| Langkah                 | Hasil yang Diharapkan                                      |
| ----------------------- | ---------------------------------------------------------- |
| Jalankan aplikasi       | Splash screen muncul 2 detik                               |
| Belum login             | Muncul halaman login                                       |
| Login: `noe` / `noe45` | Masuk ke halaman utama                                     |
| Buka button setting     | Ubah tema dan notifikasi                                   |
| Klik save & back        | Tema & status notifikasi diperbarui                        |
| Tekan Logout            | Kembali ke halaman login(hapus value di shared preference) |
| Buka ulang aplikasi     | Masuk otomatis jika sudah login                            |

---

## 💾 Preferensi yang Disimpan (PrefsHelper)

| Key                      | Tipe    | Deskripsi                     |
| ------------------------ | ------- | ----------------------------- |
| `isLoggedIn`             | Boolean | Status login pengguna         |
| `username`               | String  | Username terakhir             |
| `isDarkMode`             | Boolean | Status tema                   |
| `isNotificationsEnabled` | Boolean | Notifikasi aktif atau tidak   |
| `isThemeChanged`         | Boolean | Flag untuk memicu recreate UI |

---

## 🛠️ Teknologi yang Digunakan

- Kotlin (Android)
- SharedPreferences
- XML UI Design

---

## 📸 Screenshot

Screenshoot lengkap dapat dilihat pada file berikut:

📄 [Screenshoot.docx](./Screenshoot.docx)